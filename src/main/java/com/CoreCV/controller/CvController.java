package com.CoreCV.controller;


import com.CoreCV.model.FullCvModel;
import com.CoreCV.model.FullCvViewModel;
import com.CoreCV.model.ProfileImage;
import com.CoreCV.model.SkillModel;
import com.CoreCV.service.CvService;
import com.CoreCV.service.SkillCvService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "api/cv")
public class CvController {


    private final CvService cvService;

    public CvController(CvService cvService) {
        this.cvService = cvService;
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<FullCvModel> insertSkill(@RequestBody FullCvModel fullCvModel){
       cvService.insertCv(fullCvModel);
       return new ResponseEntity<>(fullCvModel, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    private ResponseEntity<List<FullCvViewModel>> getAllCvs() {
        return new ResponseEntity<>(cvService.getAllCvs(), HttpStatus.OK);
    }




    @RequestMapping(value = "/cvImage/{cvId}", method = RequestMethod.GET)
    private ResponseEntity<ProfileImage> getCvImageById(@PathVariable("cvId") Long cvId) {
        return new ResponseEntity<>(cvService.getCvImageBase64(cvId), HttpStatus.OK);
    }





    @RequestMapping(method = RequestMethod.PUT)
    private ResponseEntity<FullCvViewModel> updateEducation(@RequestBody FullCvViewModel fullCvViewModel) {
        return new ResponseEntity<>(new FullCvViewModel(cvService.updateCv(fullCvViewModel)), HttpStatus.OK);
    }

    @RequestMapping(value = "/{cvId}", method = RequestMethod.DELETE)
    private ResponseEntity deleteCvById(@PathVariable("cvId") Long cvId) {
        cvService.deleteCv(cvId);
        return new ResponseEntity(HttpStatus.OK);
    }



}
