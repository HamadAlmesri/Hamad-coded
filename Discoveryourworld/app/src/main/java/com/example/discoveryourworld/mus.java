package com.example.discoveryourworld;

public class mus {

    private String name;
    private int image;
    private String country;
    private int rate;


    public mus(String name, int image, String country, int rate) {
        this.name = name;
        this.image = image;
        this.country = country;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
