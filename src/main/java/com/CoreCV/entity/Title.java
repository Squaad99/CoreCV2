package com.CoreCV.entity;

import com.CoreCV.model.TitleModel;

import javax.persistence.*;


@Entity
@Table(name = "title")
public class Title {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 50)
    private String name;

    public Title(String name) {
        this.name = name;
    }

    public Title(TitleModel titleModel){
        this.name = titleModel.getName();
    }

    public Title(){}

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
