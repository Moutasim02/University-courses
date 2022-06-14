package com.programming_II_CSC202.Lectures.ChapterThirteen;

public class Circle extends  GeometricObject{

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override /** Return area */
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    @Override /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /* Print the circle info */
    public String toString() {
        return "The circle is created " + getDateCreated() +
                "\nradius is " + radius +"\nArea is " +getArea();
    }

}