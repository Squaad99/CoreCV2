package com.CoreCV.model;

import com.CoreCV.entity.Cv;
import com.CoreCV.entity.Education;

import javax.persistence.Column;

public class EducationModel {

    private Long id;
    private String name;
    private int start;
    private int end;
    private String comment;
    private Cv cv;

    public EducationModel(Long id, String name, int start, int end, String comment, Cv cv) {
        this.id = id;
        this.name = name;
        this.start = start;
        this.end = end;
        this.comment = comment;
        this.cv = cv;
    }

    public EducationModel(Education education){
        this.id = education.getId();
        this.name = education.getName();
        this.start = education.getStart();
        this.end = education.getEnd();
        this.comment = education.getComment();
        this.cv = education.getCv();
    }

    public EducationModel(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Cv getCv() {
        return cv;
    }

    public void setCv(Cv cv) {
        this.cv = cv;
    }
}
