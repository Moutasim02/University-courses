package com.structured_programming_SWE201.Chapter3.classExercises;

import java.util.Scanner;

public class GradeStatus {
    
    public static void main ( String [] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your grade : ");
        
        char grade = input.nextLine().charAt(0);
      
        
        switch (grade){
            case 'A': 
            case 'a' : System.out.println("Excellent");
            break;
            case 'B': 
            case 'b': System.out.println("Very Good");
            break;
            case 'C': 
            case 'c': System.out.println("Good");
            break;
            case 'D': 
            case 'd': System.out.println("Pass");
            break;
            case 'F': 
            case 'f': System.out.println("Fail");
            break;
            default: System.out.println("invalid input");
        }
        
    }
    
}