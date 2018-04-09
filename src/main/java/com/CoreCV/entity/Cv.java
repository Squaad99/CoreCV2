package com.CoreCV.entity;

import com.CoreCV.model.FullCvModel;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;


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
    private String cvAddress;

    @Column(name = "country")
    private String cvCountry;

    @Column(name = "city")
    private String city;

    @Column(name = "zipCode")
    private String zipCode;

    @Column(name = "phone")
    private String phone;

    @Lob
    @Column(name = "picturePath")
    private byte[] picturePath;

    @Column(name = "title")
    private String title;

    @Column(name = "comment")
    private String comment;

    @Column(name = "posted")
    private Date posted;

    public Cv(String fullName, int birthYear, String email, String cvAddress, String cvCountry, String city, String zipCode, String phone, byte[] picturePath, String title, String comment, Date posted) {
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.email = email;
        this.cvAddress = cvAddress;
        this.cvCountry = cvCountry;
        this.city = city;
        this.zipCode = zipCode;
        this.phone = phone;
        this.picturePath = picturePath;
        this.title = title;
        this.comment = comment;
        this.posted = posted;
    }

    public Cv(FullCvModel fullCvModel){
        this.fullName = fullCvModel.getFirstName() + " " + fullCvModel.getLastName();
        this.birthYear = fullCvModel.getBirthYear();
        this.email = fullCvModel.getEmail();
        this.cvAddress = fullCvModel.getCvAddress();
        this.cvCountry = fullCvModel.getCvCountry();
        this.city = fullCvModel.getCity();
        this.zipCode = fullCvModel.getZipCode();
        this.phone = fullCvModel.getPhone();
        byte[] imageBytes = fullCvModel.getImageBase64().getBytes();
        this.picturePath = imageBytes;
        this.title = fullCvModel.getTitle();
        this.comment = fullCvModel.getComment();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String out = df.format(new Date());
        this.posted = new Date();
    }

    public Cv() {}

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

    public String getCvAddress() {
        return cvAddress;
    }

    public void setCvAddress(String cvAddress) {
        this.cvAddress = cvAddress;
    }

    public String getCvCountry() {
        return cvCountry;
    }

    public void setCvCountry(String cvCountry) {
        this.cvCountry = cvCountry;
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

    public byte[] getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(byte[] picturePath) {
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

    public Date getPosted() {
        return posted;
    }

    public void setPosted(Date posted) {
        this.posted = posted;
    }
}
