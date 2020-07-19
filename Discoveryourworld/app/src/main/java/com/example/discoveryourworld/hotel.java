package com.example.discoveryourworld;

public class hotel {
    private String name;
    private int img;
    private String county;
    private int rate ;


    public hotel(String name, int img, String county, int rate) {
        this.name = name;
        this.img = img;
        this.county = county;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
