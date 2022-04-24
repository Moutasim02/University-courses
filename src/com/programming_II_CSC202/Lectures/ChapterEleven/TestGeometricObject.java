package com.programming_II_CSC202.Lectures.ChapterEleven;

import java.util.ArrayList;

public class TestGeometricObject {

/*		Rectangle r = new Rectangle("blue",true,13,7);

		r.printRectangle();

//		System.out.println(r);

        GeometricObject g2 = new Circle();
        GeometricObject g1 = new Rectangle();
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        GeometricObject g3 = new GeometricObject();
        Object g4 = new GeometricObject();

        System.out.println("\n====================================\n");
        c1.setRadius(21.56);
//		System.out.println("Area of the circle c1 is " +c1.getArea());

        if (g2 instanceof Circle) {
            System.out.println("g2 object is a Circle");
            ((Circle) g2).setRadius(21.56);
            System.out.println("Area of the circle is " + ((Circle) g2).getArea());

            System.out.println("Are g2 and c1 equal ? " + ((Circle) g2).equals(c1));
        } else if (g2 instanceof Rectangle) {
            System.out.println("g2 object is a Rectangle");
            ((Rectangle) g2).setLength(20);
            ((Rectangle) g2).setWidth(15);

            System.out.println("Area of the rectangle is " + ((Rectangle) g2).getArea());

        }

 */

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("A circle " + circle1.toString());
        System.out.println("The radius is " + circle1.getRadius());
        System.out.println("A area is " + circle1.getArea());
        System.out.println("A diameter is " + circle1.getDiameter());

        Rectangle rectangle = new Rectangle("red", true, 15, 15 );
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("A area is " + rectangle.getArea());
        System.out.println("A perimeter is " + rectangle.getPerimeter());

        //Polymorphism and Dynamic Binding
        GeometricObject circle2 = new Circle();
        Circle circle3 = (Circle) circle2;
        System.out.println("\nA circle " + circle2.toString());
        System.out.println("The radius is " + ((Circle) circle2).getRadius());
        System.out.println("A area is " + ((Circle) circle2).getArea());
        System.out.println("A diameter is " + circle3.getDiameter());

        if (circle2 instanceof GeometricObject) {
            System.out.println("True");
        }
        if (circle3 instanceof GeometricObject) {
            System.out.println("True");
        }
        if (circle3 instanceof Circle) {
            System.out.println("True");
        }
        if (circle3 instanceof Circle) {
            System.out.println("True");
        }
        //equals
        System.out.println(circle1.equals(circle2));
        A a1 = new A();
        A a2 = new A();
        System.out.println(a1.equals(a2));


        //array list
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Abu Dhabi");
        cities.add("Dubai");
        System.out.println(cities.size());
        System.out.println(cities.contains("Abu Dhabi"));
        //if "Dubai" index of cities return 1, otherwise return -1
        System.out.println(cities.indexOf("Dubai"));
        System.out.println(cities.isEmpty());
        System.out.println(cities.get(1));
        cities.set(1, "Al ain");

        for (int i = 0; i < cities.size(); i++) {
            System.out.print("[" + cities.get(i) + "]");
        }
        System.out.println();
        System.out.println(cities.remove("Abu Dhabi"));
        System.out.println(cities.remove(0));
    }
}

class A {
    int x;

    public boolean equals(Object o) {
        return this.x == ((A) o).x;
    }

}
