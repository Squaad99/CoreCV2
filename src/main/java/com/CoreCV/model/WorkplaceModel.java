package com.CoreCV.model;


public class WorkplaceModel {

    private Long id;
    private String name;
    private int start;
    private int end;
    private String comment;

    public WorkplaceModel(Long id, String name, int start, int end, String comment) {
        this.id = id;
        this.name = name;
        this.start = start;
        this.end = end;
        this.comment = comment;
    }

    public WorkplaceModel() {}

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
}
