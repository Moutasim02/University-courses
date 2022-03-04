package com.programming_II_CSC202.Lectures.ChapterNine;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(10);

        System.out.println("Circle with radius of " + c1.getRadius() + " is " + c1.calculateArea());
    }

}
