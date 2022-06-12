package com.programming_II_CSC202.Lectures.LectureThirteen;

public class TestGeometricObject {
    public static void main(String[] args) {
        // Declare and initialize two geometric objects
        GeometricObject obj1 = new Circle(5);  //polymorphism
        GeometricObject obj2 = new Rectangle(3, 5);

        System.out.println(obj1);
        System.out.println("==========================");
        System.out.println(obj2.toString());

        System.out.println("Are the objects equal ?"+
                equalArea(obj1,obj2));

        if ( obj2 instanceof Circle) {
            ((Circle)obj2).setRadius(10);
            System.out.println(obj2);
        }
        else {
            ((Rectangle)obj2).setHeight(10);
            ((Rectangle)obj2).setWidth(5);
            System.out.println(obj2);
        }

    }

    public static boolean equalArea (GeometricObject o1, GeometricObject o2) {

        return o1.getArea() == o2.getArea();
    }
}