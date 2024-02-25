package com.example.vaccine_recyclerview;

public class VaccineModel {
    private int image;
    private String title;

    public VaccineModel(String title,int image) {
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }
}
