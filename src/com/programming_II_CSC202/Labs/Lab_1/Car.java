package com.programming_II_CSC202.Labs.Lab_1;

public class Car {
    // Task 1
    // Task 6  - 1080415
    private String brand;
    private String color;
    private int currentSpeed;
    static int numberOfObjects;

    Car() {
        numberOfObjects++;
    }

    //task 2  - 1080415
    Car(String brand, String color, int currentSpeed) {
        this.brand = brand;
        this.color = color;
        this.currentSpeed = currentSpeed;
        numberOfObjects++;
    }

    //Task 3  - 1080415
    public int increaseSpeed(int increment) {
        this.currentSpeed = this.currentSpeed + increment;
        return currentSpeed;
    }


    //Task 5  - 1080415
    static int getNumberObjects() {
        return numberOfObjects;
    }
    // Task 7  - 1080415
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }
    //Task 7  - 1080415
    public void setColor(String color) {
        this.color = color;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    // Task 7  - 1080415
    public String toString() {
        return "brand=" + brand + ", color=" + color + ", currentSpeed=" +
                currentSpeed;
    }

    public void changeColortoBlack(Car c) {
        c.color = "black";
    }



}

