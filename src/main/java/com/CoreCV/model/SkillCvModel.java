package com.CoreCV.model;

import com.CoreCV.entity.SkillCv;

public class SkillCvModel {

    private Long id;
    private String name;
    private String type;
    private boolean selected;
    private boolean exp1;
    private boolean exp2;
    private boolean exp3;

    public SkillCvModel(Long id, String name, String type, boolean selected, boolean exp1, boolean exp2, boolean exp3) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.selected = selected;
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.exp3 = exp3;
    }

    public SkillCvModel(SkillCv skillCv) {
        this.id = skillCv.getId();
        this.name = skillCv.getName();
        this.exp1 = skillCv.getExp1();
        this.exp2 = skillCv.getExp2();
        this.exp3 = skillCv.getExp3();
    }

    public SkillCvModel() {}

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean isExp1() {
        return exp1;
    }

    public void setExp1(boolean exp1) {
        this.exp1 = exp1;
    }

    public boolean isExp2() {
        return exp2;
    }

    public void setExp2(boolean exp2) {
        this.exp2 = exp2;
    }

    public boolean isExp3() {
        return exp3;
    }

    public void setExp3(boolean exp3) {
        this.exp3 = exp3;
    }
}
