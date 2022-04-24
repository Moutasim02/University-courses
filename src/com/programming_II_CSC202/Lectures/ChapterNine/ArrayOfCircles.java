package com.programming_II_CSC202.Lectures.ChapterNine;
import java.util.Scanner;

public class ArrayOfCircles {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Circle [] circleArray = new Circle[4];

//		circleArray[0] = new Circle(10);

        System.out.println("number of circles " +circleArray.length);

        for ( int i = 0 ; i<circleArray.length; i++) {
            System.out.print("Please enter radius for object number " + (i+1) +" :");


//			circleArray[i] = new Circle(Math.random()*100);
//            circleArray[i] = new Circle(input.nextDouble());


        }

        for ( int i = 0 ; i <circleArray.length ; i++) {
            System.out.println(circleArray[i].toString());
        }

    }

}
