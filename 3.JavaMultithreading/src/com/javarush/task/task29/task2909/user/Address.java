package com.javarush.task.task29.task2909.user;

public class Address {
    private String country;
    private String city;

    public void setHouse(String house) {
        this.house = house;
    }

    public String getHouse() {
        return house;
    }

    private String house;

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

//    public void setHouse(House house) {
//        this.house = house;
//    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }
//
//    public House getHouse() {
//        return house;
//    }
}
