package com.programming_II_CSC202.Lectures.ChapterEleven;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {

        System.out.println("Creating a Circle object");
    }

    public Circle(double radius) {

        System.out.println("Creating a Circle object with Radius of " + radius);
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    /**
     * Return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set a new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Return area
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }


    /**
     * Return diameter
     */
    public double getDiameter() {
        return 2 * radius;
    }

    /**
     * Return perimeter
     */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }


    public boolean equals(Object o) {
        if (o instanceof Circle)

            return radius == ((Circle) o).radius;
        else
            return false;


    }

    public String toString() {
        return "\nRadius of the circle is " + radius
                + "\nThe area of the circle is " + getArea()
                + "\n" + super.toString();
    }


}