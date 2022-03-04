package com.programming_II_CSC202.Lectures.ChapterNine;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }


}
