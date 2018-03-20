package com.CoreCV.entity;

import javax.persistence.*;

@Entity
@Table(name = "workplace")
public class WorkPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "workplace_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "start")
    private int start;

    @Column(name = "end")
    private int end;

    @Column(name = "comment")
    private String comment;

    @ManyToOne
    @JoinColumn(name = "cv_id", referencedColumnName = "cv_id")
    private Cv cv;

    public WorkPlace(String name, int start, int end, String comment, Cv cv) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.comment = comment;
        this.cv = cv;
    }

    public WorkPlace(){}

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
