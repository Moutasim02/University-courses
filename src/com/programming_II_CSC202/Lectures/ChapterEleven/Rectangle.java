package com.programming_II_CSC202.Lectures.ChapterEleven;

public class Rectangle extends GeometricObject {
    private double length;
    private double width;

    public Rectangle() {

        System.out.println("Creating a Rectangle object using default constructor");
    }

    public Rectangle(double length, double width) {
        System.out.println("Creating a Rectangle object using NON-DEFAULT constructor");

        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        System.out.println("Creating a Rectangle object using NON-DEFAULT constructor with FOUR data fields");
        this.length = length;
        this.width = width;


    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        double area;
        area = length * width;
        return area;
    }


    public void printRectangle() {
        System.out.println(" Rectangle created on " + super.getDateCreated()
                + "\nThe area is " + getArea());
    }

    public String getPerimeter() {
        return "method idk where it came from";
    }
}