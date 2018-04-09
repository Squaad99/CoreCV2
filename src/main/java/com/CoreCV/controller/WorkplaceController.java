package com.CoreCV.controller;


import com.CoreCV.model.EducationModel;
import com.CoreCV.model.WorkplaceModel;
import com.CoreCV.service.CvService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "api/work")
public class WorkplaceController {

    private final CvService cvService;

    public WorkplaceController(CvService cvService) {
        this.cvService = cvService;
    }

    @RequestMapping(method = RequestMethod.PUT)
    private ResponseEntity<WorkplaceModel> updateWorkplace(@RequestBody WorkplaceModel workplaceModel) {
        return new ResponseEntity<>(new WorkplaceModel(cvService.updateWorkplace(workplaceModel)), HttpStatus.OK);
    }






}
