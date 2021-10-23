package com.structured_programming_SWE201.Chapter3.classExercises;
import java.util.Scanner;
/**
90 - 100 A
 * 80 - 89  B
 * 70 - 79  C
 * 60 - 69  D
 * 0  - 59  F
 */
public class Grades {
    
    public static void main (String [] args) {
        
    
    System.out.println("Please enter the grade:");
    Scanner khaled = new Scanner(System.in);
  
    int x = khaled.nextInt();
    
    
    if ( x >= 90 && x <= 100)
        System.out.println("Grade is A");
     else if ( x >= 80 && x <= 89)
            System.out.println("Grade is B");
        else if ( x >= 70 && x <= 79)
            System.out.println("Grade is C");
        else if ( x >= 60 && x < 70 )
            System.out.println("Grade is D");
        else if ( x >= 0 && x < 60)
            System.out.println("Grade is F");
        else
            System.out.println("Invalid input");
                
        
    }
}
