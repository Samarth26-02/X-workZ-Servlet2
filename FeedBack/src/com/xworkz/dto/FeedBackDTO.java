package com.xworkz.dto;

public class FeedBackDTO {
    private String name;
    private String email;
    private String subject;
    private String message;
    private String city;
    private String state;
    private int rating;
    private boolean recommend;

    public FeedBackDTO(String name, String email, String subject, String message, String city, String state, int rating, boolean recommend) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.message = message;
        this.city = city;
        this.state = state;
        this.rating = rating;
        this.recommend = recommend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isRecommend() {
        return recommend;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }
}
