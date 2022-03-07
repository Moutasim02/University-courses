package com.programming_II_CSC202.Lectures.ChapterNine;
import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1- Number of objects is : "+Circle.getNumberOfObjects());

        Circle c1 = new Circle();

        System.out.println("2 - Number of objects is : "+Circle.getNumberOfObjects());
        Circle c2 = new Circle (100);
        Circle c3 = new Circle (15.0);

        System.out.println("3 - Number of objects is : "+Circle.getNumberOfObjects());

        Circle c4 = new Circle();
        c4 = c2;

        System.out.println("4 - Number of objects is : "+Circle.getNumberOfObjects());

/*		System.out.print("Please enter the radius of the circle : ");

		c1.radius = input.nextDouble();
*/
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);


        c1 = c3;

        System.out.println("===============================");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);


        c1.radius = 50;

        System.out.println("===============================");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c3.radius = 300;
        System.out.println("===============================");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
