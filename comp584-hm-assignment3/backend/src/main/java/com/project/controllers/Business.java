package com.project.models;

public class Business {
    private Long business_id;
    private String name;
    private Long address;
    private String city;
    private String state;
    private Long postal_code;
    private double stars;
    private int review_count;
    private int is_open;
    private String categories;
}

public Long getId() {
    return business_id;
}

public void setId(Long business_id) {
    this.business_id = business_id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public Long getAddress() {
    return address;
}

public void setAddress(Long address) {
    this.address = address;
}

public String getCity() {
    return city;
}

public void setCity(String city) {
    this.city = city;
}

public String getState() {
    return state;
}

public void setState(String state) {
    this.state = state;
}

public Long getPostal() {
    return postal_code;
}

public void setPostal(Long postal_code) {
    this.postal_code = postal_code;
}

public double getStars() {
    return stars;
}

public void setStars(double stars) {
    this.stars = stars;
}

public int getReview() {
    return review_count;
}

public void setReview(int review_count) {
    this.review_count = review_count;
}

public int getOpen() {
    return is_open;
}

public void setOpen(int is_open) {
    this.is_open = is_open;
}

public int getCategories() {
    return categories;
}

public void setCategories(int categories) {
    this.categories = categories;
}