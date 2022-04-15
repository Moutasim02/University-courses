package com.programming_II_CSC202.Lectures.ChapterEleven;

public class TestGeometricObject {
    public static void main(String[] args) {

/*		Rectangle r = new Rectangle("blue",true,13,7);

		r.printRectangle();

//		System.out.println(r);

	*/

        GeometricObject g2 = new Circle();
        GeometricObject g1 = new Rectangle();
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        GeometricObject g3 = new GeometricObject();
        Object g4 = new GeometricObject();

        System.out.println("\n====================================\n");
        c1.setRadius(21.56);
//		System.out.println("Area of the circle c1 is " +c1.getArea());

        if ( g2 instanceof Circle) {
            System.out.println("g2 object is a Circle");
            ((Circle) g2).setRadius(21.56);
            System.out.println("Area of the circle is " +((Circle)g2).getArea());

            System.out.println("Are g2 and c1 equal ? "+ ((Circle)g2).equals(c1));
        }
        else if ( g2 instanceof Rectangle ) {
            System.out.println("g2 object is a Rectangle");
            ((Rectangle)g2).setLength(20);
            ((Rectangle)g2).setWidth(15);

            System.out.println("Area of the rectangle is " +((Rectangle)g2).getArea());

        }


    }
}
