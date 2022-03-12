package com.programming_II_CSC202.Labs;

public class Car {
    // Task 1
    String brand;
    String color;
    int currentSpeed;

    Car() {
    }

    //task 2
    Car(String brand, String color, int currentSpeed) {
        this.brand = brand;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

    //Task 3
    public int increaseSpeed(int increment) {
        this.currentSpeed = this.currentSpeed + increment;
        return currentSpeed;
    }
}

