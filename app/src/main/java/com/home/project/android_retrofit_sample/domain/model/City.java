package com.home.project.android_retrofit_sample.domain.model;

public class City {

    private String name;
    private String state;
    private String country;

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }


    @Override
    public String toString() {

        return getName() + " / " + getState() + " / " + getCountry();
    }
}
