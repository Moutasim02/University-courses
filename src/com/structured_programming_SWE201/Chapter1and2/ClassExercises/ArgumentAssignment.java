
package com.structured_programming_SWE201.Chapter1and2.ClassExercises;


public class ArgumentAssignment {

    public static void main(String[] args) {

        int x = 9;

        System.out.println("1- Value of  x is " + x);

        x -= 8;   // old x value is on line 15 .. x=9-8
        System.out.println("2- Value of  x is " + x);


        x %= 2;   // old x is on line 19 .. x=1 remainder 2

        System.out.println("3- Value of  x is " + x);
    }

}