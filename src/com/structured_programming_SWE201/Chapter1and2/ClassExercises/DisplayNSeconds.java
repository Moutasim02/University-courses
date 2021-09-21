
package com.structured_programming_SWE201.Chapter1and2.ClassExercises;

import java.util.Scanner;

public class DisplayNSeconds {
    
    public static void main (String [] args ) {
        
        Scanner khaled = new Scanner (System.in);
        
       System.out.print(" Please enter number of seconds");
       
       int numberOfSeconds = khaled.nextInt();
       
       int minutes = numberOfSeconds/ 60;
       //int seconds = numberOfSeconds 
       
       System.out.print(numberOfSeconds + 
            
               " is " + minutes + "minutes"   );
    }
    
}
