package com.CoreCV.model;

import com.CoreCV.entity.SkillCv;

import java.util.List;

public class FullCvModel {

    private Long id;
    private String fullName;
    private int birthYear;
    private String email;
    private String cvAddress;
    private String country;
    private String city;
    private String zipCode;
    private String phone;
    private String picturePath;
    private String title;
    private String comment;

    private List<EducationModel> educationList;
    private List<WorkplaceModel> workPlaceList;
    private List<SkillCv> fullSkillList;

    public FullCvModel(Long id, String fullName, int birthYear, String email, String cvAddress, String country, String city, String zipCode, String phone, String picturePath, String title, String comment, List<EducationModel> educationList, List<WorkplaceModel> workPlaceList, List<SkillCv> fullSkillList) {
        this.id = id;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.email = email;
        this.cvAddress = cvAddress;
        this.country = country;
        this.city = city;
        this.zipCode = zipCode;
        this.phone = phone;
        this.picturePath = picturePath;
        this.title = title;
        this.comment = comment;
        this.educationList = educationList;
        this.workPlaceList = workPlaceList;
        this.fullSkillList = fullSkillList;
    }

    public FullCvModel() {
    }

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

    public List<EducationModel> getEducationList() {
        return educationList;
    }

    public void setEducationList(List<EducationModel> educationList) {
        this.educationList = educationList;
    }

    public List<WorkplaceModel> getWorkPlaceList() {
        return workPlaceList;
    }

    public void setWorkPlaceList(List<WorkplaceModel> workPlaceList) {
        this.workPlaceList = workPlaceList;
    }

    public List<SkillCv> getFullSkillList() {
        return fullSkillList;
    }

    public void setFullSkillList(List<SkillCv> fullSkillList) {
        this.fullSkillList = fullSkillList;
    }
}
