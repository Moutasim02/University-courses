package com.programming_II_CSC202.Lectures.ChapterNine;

public class Circle {
    double radius;
    private static int numberOfObjects = 0;

    public Circle() {
        this(1.0);
        numberOfObjects++;
    }

    public Circle (double radius) {
        this.radius = radius;
        numberOfObjects++;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {

        return Math.PI * Math.pow(radius, 2);
    }

    public double getCirc() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "The area of the circle with radius of "
                +radius +" is "
                +(int)(getArea()*1000)/1000.0
                +" and Permiter is " +getCirc();
    }


}
