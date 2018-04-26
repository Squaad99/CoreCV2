package com.CoreCV.controller;


import com.CoreCV.model.TitleModel;
import com.CoreCV.service.TitleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/title")
public class TitleController {


    private TitleService titleService;

    public TitleController(TitleService titleService) {
        this.titleService = titleService;
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<TitleModel> insertTitle(@RequestBody TitleModel titleModel) {
        TitleModel createdUser = titleService.insertTitle(titleModel);
        return new ResponseEntity<>(createdUser, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    private ResponseEntity<List<TitleModel>> getAllTitles() {
        return new ResponseEntity<>(titleService.getAllTitles(), HttpStatus.OK);
    }

    @RequestMapping("/delete/{titleId}")
    private ResponseEntity deleteTitle(@PathVariable(value="titleId") Long titleId) {
        titleService.deleteTitle(titleId);
        return new ResponseEntity(HttpStatus.OK);
    }


}
