package com.CoreCV.model;

import com.CoreCV.entity.Skill;
import com.CoreCV.entity.Title;
import org.springframework.stereotype.Component;


public class SkillModel {

    private Long id;
    private String name;
    private int type;

    public SkillModel(Long id, String name, int type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public SkillModel(Skill skill){
        this.id = skill.getId();
        this.name = skill.getName();
        this.type = skill.getType();
    }

    public SkillModel(){}


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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
