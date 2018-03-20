package com.CoreCV.entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "skill_cv")
public class SkillCv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_cv_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "exp1")
    private Boolean exp1;

    @Column(name = "exp2")
    private Boolean exp2;

    @Column(name = "exp3")
    private Boolean exp3;

    @ManyToOne
    @JoinColumn(name = "cv_id", referencedColumnName = "cv_id")
    private Cv cv;

    public SkillCv(String name, Boolean exp1, Boolean exp2, Boolean exp3, Cv cv) {
        this.name = name;
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.exp3 = exp3;
        this.cv = cv;
    }

    public SkillCv(){}

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

    public Boolean getExp1() {
        return exp1;
    }

    public void setExp1(Boolean exp1) {
        this.exp1 = exp1;
    }

    public Boolean getExp2() {
        return exp2;
    }

    public void setExp2(Boolean exp2) {
        this.exp2 = exp2;
    }

    public Boolean getExp3() {
        return exp3;
    }

    public void setExp3(Boolean exp3) {
        this.exp3 = exp3;
    }

    public Cv getCv() {
        return cv;
    }

    public void setCv(Cv cv) {
        this.cv = cv;
    }
}
