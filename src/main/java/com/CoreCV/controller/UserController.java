package com.CoreCV.controller;


import com.CoreCV.entity.User;
import com.CoreCV.exception.DuplicateUserException;
import com.CoreCV.model.UserModel;
import com.CoreCV.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<UserModel> register(@RequestBody UserModel userModel) throws DuplicateUserException {
        UserModel createdUser = userService.registerUser(userModel);
        return new ResponseEntity<>(createdUser, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    private ResponseEntity<List<UserModel>> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{username}/", method = RequestMethod.GET)
    public ResponseEntity<UserModel> getUserByUsername(@PathVariable("username") String username) {
        return new ResponseEntity<>(userService.getUserByUsername(username), HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<UserModel> updateUser(@RequestBody UserModel userModel) throws DuplicateUserException {
        User user = userService.updateUser(userModel);
        return new ResponseEntity<>(new UserModel(user), HttpStatus.OK);
    }
}
