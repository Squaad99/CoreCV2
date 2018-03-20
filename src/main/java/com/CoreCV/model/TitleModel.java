package com.CoreCV.model;


import com.CoreCV.entity.Title;

public class TitleModel {

    private Long id;
    private String name;

    public TitleModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public TitleModel(){}

    public TitleModel(Title title){
        this.id = title.getId();
        this.name = title.getName();
    }


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
}
