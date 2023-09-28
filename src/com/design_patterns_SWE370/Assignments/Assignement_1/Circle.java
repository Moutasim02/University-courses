package com.design_patterns_SWE370.Assignments.Assignement_1;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Area = PI * r^2
    public double getArea() {
        double area = Math.PI * radius * radius;
        area = Math.round(area * 100) / 100.0;
        return area;
    }

    // Perimeter = 2 * PI * r
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        perimeter = Math.round(perimeter * 100) / 100.0;
        return perimeter;
    }
}