package com.CoreCV.controller;

import com.CoreCV.service.SkillService;
import com.CoreCV.model.SkillModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/skill")
public class SkillController {


    private final SkillService skillService;

    @Autowired
    public SkillController(SkillService skillService) { this.skillService = skillService; }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<SkillModel> insertSkill(@RequestBody SkillModel skillModel){
        SkillModel createdUser =  skillService.insertSkill(skillModel);
        return new ResponseEntity<>(createdUser, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    private ResponseEntity<List<SkillModel>> getAllSkills() {
        return new ResponseEntity<>(skillService.getAllSkills(), HttpStatus.OK);
    }

    @RequestMapping("/delete/{skillId}")
    private ResponseEntity deleteSkill(@PathVariable(value="skillId") Long skillId) {
        skillService.deleteSkill(skillId);
        return new ResponseEntity(HttpStatus.OK);
    }


}
