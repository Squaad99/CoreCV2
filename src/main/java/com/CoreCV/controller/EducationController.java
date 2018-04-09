package com.CoreCV.controller;


import com.CoreCV.model.EducationModel;
import com.CoreCV.service.CvService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "api/edu")
public class EducationController {

    private final CvService cvService;

    public EducationController(CvService cvService) {
        this.cvService = cvService;
    }

    @RequestMapping(method = RequestMethod.PUT)
    private ResponseEntity<EducationModel> updateEducation(@RequestBody EducationModel educationModel) {
        return new ResponseEntity<>(new EducationModel(cvService.updateEducation(educationModel)), HttpStatus.OK);
    }

}
