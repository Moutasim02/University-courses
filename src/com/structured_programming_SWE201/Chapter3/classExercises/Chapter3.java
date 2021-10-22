package com.structured_programming_SWE201.Chapter3.classExercises;
import java.util.Scanner;

public class Chapter3 {

   
    public static void main(String[] args) {
Scanner khaled = new Scanner(System.in);
System.out.println("please enter a number: ");

int n = khaled.nextInt();

if (n % 2 != 0) {
        System.out.println("Weird");
    }
else if (n  % 2 == 0 && n >= 2 && n <= 5) {
    System.out.println("Not weird");
}
else if ( n  % 2 == 0 && n >= 6 && n <= 20) {
    System.out.println("Weird"); 
    }
else if (n  % 2 == 0 && n >= 20 ) { 
System.out.println("Not weird"); 
}

    }
}



   
    