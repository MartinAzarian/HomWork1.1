package com.company;

public class Product {
    private String title = "";
    private double price = 0;
    private double rating = 0;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Product(String title, double price, double rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }

    public Product() {
    }
}
