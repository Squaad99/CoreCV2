package com.CoreCV.entity;



import com.CoreCV.model.SkillModel;

import javax.persistence.*;

@Entity
@Table(name = "skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private Long id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "type")
    private int type;

    public Skill(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public Skill(SkillModel skillModel){
        this.name = skillModel.getName();
        this.type = skillModel.getType();

    }

    public Skill(){}

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
