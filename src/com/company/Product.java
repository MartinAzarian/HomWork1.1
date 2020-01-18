package com.company;

public class Product {
    //initilization
    private String title = "";
    private double price = 0;
    private double rating = 0;

    
    //seter's region began
    public void setTitle(String title) {
        this.title = title;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public void setPrice(double price) {
        this.price = price;
    }
   //seter's region end
   //geter's region start
    public double getPrice() {
        return price;
    }
    public double getRating() {
        return rating;
    }
    public String getTitle() {
        return title;
    }
   //geter's region end
  //constructor
    public Product(String title, double price, double rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }

    public Product() {
    }
  //~constructor
}
