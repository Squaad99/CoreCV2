package com.CoreCV.controller;


import com.CoreCV.model.Cv;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "api/cv")
public class CvController {


    private List<Cv> cvs = new ArrayList();

    CvController(){this.cvs = buildCvs();}

    @RequestMapping(method = RequestMethod.GET)
    public List<Cv> getUsers() {
        return this.cvs;
    }


    List<Cv> buildCvs() {
        List<Cv> cvs = new ArrayList<>();

        Cv cv1 = buildCv( "John", "Doe", "john@email.com", "2018-01-07");
        Cv cv2 = buildCv( "Jon", "Smith", "smith@email.com","2018-01-05");
        Cv cv3 = buildCv( "Will", "Craig", "will@email.com", "2018-02-30");
        Cv cv4 = buildCv("Sam", "Lernorad", "sam@email.com", "2018-04-17");
        Cv cv5 = buildCv( "Ross", "Doe", "ross@email.com","2018-10-23");

        cvs.add(cv1);
        cvs.add(cv2);
        cvs.add(cv3);
        cvs.add(cv4);
        cvs.add(cv5);
        cvs.add(cv1);
        cvs.add(cv2);
        cvs.add(cv3);
        cvs.add(cv4);
        cvs.add(cv5);
        cvs.add(cv1);
        cvs.add(cv2);
        cvs.add(cv3);
        cvs.add(cv4);
        cvs.add(cv5);
        cvs.add(cv1);
        cvs.add(cv2);
        cvs.add(cv3);
        cvs.add(cv4);
        cvs.add(cv5);
        cvs.add(cv1);
        cvs.add(cv2);
        cvs.add(cv3);
        cvs.add(cv4);
        cvs.add(cv5);


        return cvs;

    }

    Cv buildCv(String fname, String lname, String email, String added) {
        Cv cv = new Cv();
        cv.setFirstName(fname);
        cv.setLastName(lname);
        cv.setEmail(email);
        cv.setAdded(added);
        return cv;
    }



}
