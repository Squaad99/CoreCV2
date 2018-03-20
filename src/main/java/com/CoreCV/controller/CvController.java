package com.CoreCV.controller;


import com.CoreCV.model.SkillModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "api/cv")
public class CvController {


    @RequestMapping(method = RequestMethod.POST)
    public void insertSkill(@RequestBody SkillModel skillModel){

        System.out.println(skillModel);

    }




}
