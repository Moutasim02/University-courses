package com.structured_programming_SWE201.Chapter3.classExercises;

public class TestRandom {
    
    public static void main ( String [] args){
        
    
        int number1 = (int) (Math.random() * 100);   // 0 - 999.999 ( 100 - 0.9999 )
        int number2 = (int) (Math.random() * 100);
        System.out.println(number1 +" " +number2);
        
        if ( number1 > number2){
            System.out.println("number1 is greator than number2");
        }
        else {
            System.out.println("number2 is greator than number1");
        }
    
      
        
    }
    
}
    
