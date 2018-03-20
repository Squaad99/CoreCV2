package com.CoreCV.entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "cv")
public class Cv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cv_id")
    private Long id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "birthYear")
    private int birthYear;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "zipCode")
    private String zipCode;

    @Column(name = "phone")
    private String phone;

    @Column(name = "picturePath")
    private String picturePath;

    @Column(name = "title")
    private String title;

    @Column(name = "comment")
    private String comment;

    public Cv(String fullName, int birthYear, String email, String address, String country, String city, String zipCode, String phone, String picturePath, String title, String comment) {
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.email = email;
        this.address = address;
        this.country = country;
        this.city = city;
        this.zipCode = zipCode;
        this.phone = phone;
        this.picturePath = picturePath;
        this.title = title;
        this.comment = comment;
    }

    public Cv(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
