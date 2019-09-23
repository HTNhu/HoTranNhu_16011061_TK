package com.example.student.hotrannhu_16011061;

public class Movie {
    private String name;
    private String country;
    private String price;

    public String getCountry() {
        return country;
    }

    public String getPrice() {
        return price;
    }

    public String getName() {

        return name;
    }

    public Movie(String name, String country, String price) {
        this.name = name;
        this.country = country;
        this.price = price;
    }
}
