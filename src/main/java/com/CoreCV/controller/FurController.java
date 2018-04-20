package com.CoreCV.controller;

import com.CoreCV.exception.DuplicateUserException;
import com.CoreCV.model.UserModel;
import com.CoreCV.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/fur")
public class FurController {

    private final UserService userService;

    public FurController(UserService userService) { this.userService = userService; }

    //This method is for "First User Register(Fur) Will only work if User table is empty"
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> register(@RequestBody UserModel userModel) throws DuplicateUserException {
        if(this.userService.getAllUsers().isEmpty()){
            UserModel createdUser = userService.registerUser(userModel);
            return new ResponseEntity<>("Success, first user created.", HttpStatus.OK);
        }
        return new ResponseEntity<String>("Failed, limit reached.", HttpStatus.LOCKED);
    }


}
