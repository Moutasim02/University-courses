package com.programming_II_CSC202.Labs;

public class Car {
    String brand;
    String color;
    int currentSpeed;

    Car() {
    }
    Car(String brand, String color, int currentSpeed) {
        this.brand = brand;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

    public int increaseSpeed(int increment) {
        this.currentSpeed = this.currentSpeed + increment;
        return currentSpeed;
    }
}

