package com.home.project.android_retrofit_sample.domain.model;

public class City {

    private String name;
    private String state;
    private String country;

    public String getName() {
        if(name == null) {
            name = "";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        if(state == null){
            state = "";
        }
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        if(country == null){
            country = "";
        }
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString()    {

        return getName() + " / " + getState() + " / " + getCountry();
    }
}
