package com.structured_programming_SWE201.Chapter4.ClassExercises;

public class ConvertingStrings {

    public static void main(String[] args) {
   
        String n1 = "4.7";
        String n2 = "1.8";
       
        double d1 = Double.parseDouble(n1);
        double d2 = Double.parseDouble(n2);
        double d = d1 + d2;
        
        System.out.println(" n1 + n2 = " +(n1+n2));
        System.out.println("d1 + d2 = " +d);
        
        String ans = d +"";
    }
    }
    
