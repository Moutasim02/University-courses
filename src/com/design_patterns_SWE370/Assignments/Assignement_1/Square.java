package com.design_patterns_SWE370.Assignments.Assignement_1;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    // Area: side * side
    public double getArea() {
        return Math.round((side * side) * 100) / 100.0;
    }

    // Perimeter: 4 * side length
    public double getPerimeter() {
        return Math.round((4 * side) * 100) / 100.0;
    }
}