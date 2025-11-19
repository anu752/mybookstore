package com.bittercode.model;

import java.io.Serializable;

public class Book implements Serializable {

    private String barcode;
    private String name;
    private String author;
    private double price;
    private int quantity;

    public Book(String barcode, String name, String author, double price, int quantity) {
        this.barcode = barcode;
        this.name = name;
        this.author = author;
        this.setPrice(price);     // using setter so validation works
        this.quantity = quantity;
    }

    public Book() {
        super();
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    // Added a small validation check (minute improvement)
    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Added a useful toString() method
    @Override
    public String toString() {
        return "Book {" +
                "barcode='" + barcode + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
