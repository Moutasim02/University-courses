package com.structured_programming_SWE201.Chapter1and2.ClassExercises;

import java.util.Scanner;

public class DisplayTime {
    
    public static void main ( String [] args){
        
        //try to read from the keyboard
        
        Scanner input = new Scanner(System.in);
        
        // prompt the user to enter the number of seconds
        
        System.out.print("Please enter number of seconds : ");
        
        //read from the keyboard
        int numberOfSeconds = input.nextInt();
        // Calculate
        int minutes = numberOfSeconds / 60;
        
        int seconds = numberOfSeconds % 60;
        
        //display results
        
        System.out.println(numberOfSeconds +
                " is " +minutes +
                " minutes and " +
                seconds +" seconds");
        
        double value = Math.pow(13,2.0);
        System.out.println(value);
    }
    
}
    
      
    
    
