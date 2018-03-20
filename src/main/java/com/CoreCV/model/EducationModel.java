package com.CoreCV.model;

public class EducationModel {

    private Long id;
    private int start;
    private int end;
    private String comment;

    public EducationModel(Long id, int start, int end, String comment) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.comment = comment;
    }

    public EducationModel(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
