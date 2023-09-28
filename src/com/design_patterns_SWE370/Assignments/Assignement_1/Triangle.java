package com.design_patterns_SWE370.Assignments.Assignement_1;

public class Triangle implements Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Area (Triangle) = 1/2 bh
    public double getArea() {
        return Math.round((0.5 * base * height) * 100) / 100.0;
    }

    // Perimeter (Triangle) = summation(3 sides)
    public double getPerimeter() {
        return Math.round((side1 + side2 + side3) * 100) / 100.0;
    }
}
