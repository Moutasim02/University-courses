package com.programming_II_CSC202.Labs.Lab5;

// Moutasim El Ayoubi - 1080415
public class Laptop {
    private String brand;
    private int size;

    public Laptop() {
    }

    public Laptop(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\nSize: " + size;
    }

    public void Message() {
        System.out.println("Laptops for sale");
    }
}
