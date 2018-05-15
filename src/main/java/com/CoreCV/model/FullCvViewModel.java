package com.CoreCV.model;

import com.CoreCV.entity.Cv;
import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class FullCvViewModel {

    private Long id;
    private String fullName;
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
    private String posted;

    private List<EducationModel> educationList;
    private List<WorkplaceModel> workPlaceList;
    private List<SkillCvModel> fullSkillList;

    public FullCvViewModel(Long id, String fullName, int birthYear, String email, String cvAddress, String cvCountry, String city, String zipCode, String phone, String imageBase64, String title, String comment, String posted, List<EducationModel> educationList, List<WorkplaceModel> workPlaceList, List<SkillCvModel> fullSkillList) {
        this.id = id;
        this.fullName = fullName;
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
        this.posted = posted;
        this.educationList = educationList;
        this.workPlaceList = workPlaceList;
        this.fullSkillList = fullSkillList;
    }

    public FullCvViewModel(Cv cv) {
        this.id = cv.getId();
        this.fullName = cv.getFullName();
        this.birthYear = cv.getBirthYear();
        this.email = cv.getEmail();
        this.cvAddress = cv.getCvAddress();
        this.cvCountry = cv.getCvCountry();
        this.city = cv.getCity();
        this.zipCode = cv.getZipCode();
        this.phone = cv.getPhone();
        this.title = cv.getTitle();
        this.comment = cv.getComment();
        this.imageBase64 = null;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String stringDate = df.format(cv.getPosted());
        this.posted = stringDate;

        this.educationList = new ArrayList<EducationModel>();
        this.workPlaceList  = new ArrayList<WorkplaceModel>();
        this.fullSkillList  = new ArrayList<SkillCvModel>();
    }

    public FullCvViewModel(){}

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

    public String getPosted() {
        return posted;
    }

    public void setPosted(String posted) {
        this.posted = posted;
    }
}
