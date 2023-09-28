package com.design_patterns_SWE370.Assignments.Assignement_1;

public class Main {
    // Starting Point
    public static void main(String[] args) {
        // Polymorphic shapes: Ease of change in type of object we are creating
        Shape circle = new Circle(5);
        Shape square = new Square(3);
        Shape triangle = new Triangle(3, 4, 5, 4, 3);


        // Printing Objects Data
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());

        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
    }
}