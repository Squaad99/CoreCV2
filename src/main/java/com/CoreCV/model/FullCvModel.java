package com.CoreCV.model;

import com.CoreCV.entity.Cv;

import java.util.List;

public class FullCvModel {

    private Long id;
    private String firstName;
    private String lastName;
    private int birthYear;
    private String email;
    private String cvAddress;
    private String cvCountry;
    private String city;
    private String zipCode;
    private String phone;
    private String imageBase64;
    private String title;
    private String comment;

    private List<EducationModel> educationList;
    private List<WorkplaceModel> workPlaceList;
    private List<SkillCvModel> fullSkillList;

    public FullCvModel(Long id, String firstName, String lastName, int birthYear, String email, String cvAddress, String cvCountry, String city, String zipCode, String phone, String imageBase64, String title, String comment, List<EducationModel> educationList, List<WorkplaceModel> workPlaceList, List<SkillCvModel> fullSkillList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.email = email;
        this.cvAddress = cvAddress;
        this.cvCountry = cvCountry;
        this.city = city;
        this.zipCode = zipCode;
        this.phone = phone;
        this.imageBase64 = imageBase64;
        this.title = title;
        this.comment = comment;
        this.educationList = educationList;
        this.workPlaceList = workPlaceList;
        this.fullSkillList = fullSkillList;
    }

    public FullCvModel(FullCvModel fullCvModel) {
        this.id = fullCvModel.getId();
        this.firstName = fullCvModel.getFirstName();
        this.lastName = fullCvModel.getLastName();
        this.birthYear = fullCvModel.getBirthYear();
        this.email = fullCvModel.getEmail();
        this.cvAddress = fullCvModel.getCvAddress();
        this.cvCountry = fullCvModel.getCvCountry();
        this.city = fullCvModel.getCity();
        this.zipCode = fullCvModel.getZipCode();
        this.phone = fullCvModel.getPhone();
        this.imageBase64 = fullCvModel.getImageBase64();
        this.title = fullCvModel.getTitle();
        this.comment = fullCvModel.getComment();
    }

    public FullCvModel() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
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

    public List<SkillCvModel> getFullSkillList() {
        return fullSkillList;
    }

    public void setFullSkillList(List<SkillCvModel> fullSkillList) {
        this.fullSkillList = fullSkillList;
    }
}
