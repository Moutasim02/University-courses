package com.structured_programming_SWE201.Chapter3.classExercises;

import java.util.Scanner;

public class RadiusFromKeyboard {
       public static void main ( String [] args){
          
        //2. create Scanner object
        
        Scanner input = new Scanner(System.in);
       
        //3. Ask (prompt) the user to enter the radius of the circle
        System.out.print("Please enter radius of the circle : ");
        
        //4. read the value entered by the user from the keyboard
        
        double radius = input.nextDouble();
        
        //5. check the radius ( is it negative or positive )
        
        if ( radius >= 0 ){
        //5. Calculate 
         
        double area = radius * radius * 3.14;
        //6.Display results
        
        System.out.println( "The area of a circle with radius of " +
                radius +" is " +area);
        }
        else {
            System.out.println("Radius can NOT be nagative");
        }
        
    }
    
    
}