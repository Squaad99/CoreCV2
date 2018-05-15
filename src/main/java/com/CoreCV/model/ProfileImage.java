package com.CoreCV.model;

import com.CoreCV.entity.Cv;

import java.nio.charset.StandardCharsets;

public class ProfileImage {

    String base64Image;

    public ProfileImage(String base64Image) {
        this.base64Image = base64Image;
    }

    public ProfileImage(Cv cv) {
        String base64 = new String(cv.getPicturePath(), StandardCharsets.UTF_8);
        this.base64Image = base64;
    };

    public String getBase64Image() {
        return base64Image;
    }

    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
    }
}
