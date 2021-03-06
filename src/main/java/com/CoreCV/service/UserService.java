package com.CoreCV.service;


import com.CoreCV.entity.User;
import com.CoreCV.exception.DuplicateUserException;
import com.CoreCV.model.UserModel;
import com.CoreCV.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public List<UserModel> getAllUsers() {
        List<User> users = userRepository.findAll();
        List<UserModel> userModels = new ArrayList<>();
        for(User user: users) {
            userModels.add(new UserModel(user));
        }
        return userModels;
    }

    public UserModel getUserByUsername(String username) {
        return new UserModel(userRepository.findByUsername(username));
    }

    public UserModel registerUser(UserModel userModel) throws DuplicateUserException {
        if(userRepository.findByUsername(userModel.getUsername()) != null) {
            throw new DuplicateUserException();
        }
        userModel.setPassword(bCryptPasswordEncoder.encode(userModel.getPassword()));
        User user = userRepository.save(new User(userModel));
        return new UserModel(user);
    }

    public User getUserByUserId(int id) {
        return userRepository.findOne(id);
    }

    public User updateUser(UserModel userModel) throws DuplicateUserException {
        if(!userRepository.findOne(userModel.getUserId()).getUsername().equals(userModel.getUsername())) {
            if(userRepository.findByUsername(userModel.getUsername()) != null) {
                throw new DuplicateUserException();
            }
        }
        if(!userRepository.findOne(userModel.getUserId()).getPassword().equals(userModel.getPassword())) {
           userModel.setPassword(bCryptPasswordEncoder.encode(userModel.getPassword()));
        }
        return userRepository.save(new User(userModel));
    }

    public void deleteUser(int userId){
        userRepository.delete(userId);
    }
}