package com.programming_II_CSC202.Lectures.ChapterTen;

public class WrapperDemo {
    public static void main(String[] args) {
        // Boolean, Character, Double, Float, Byte, Short, Integer, Long wrapper classes
        // wrapper classes is
//        Double y = new Double("12.3");
//        Integer x1 = new Integer("32");
//        Integer x2 = new Integer("32");
        Integer x3 = Integer.valueOf(32);
        Integer x4 = Integer.valueOf("32");
        Integer x5 = 32; // same as Integer.valueOf("32");

//        System.out.println("y is " + y);
//        System.out.println("x1 == x2 is " + (x1 == x2)); // Display false
//        System.out.println("x1 == x3 is " + (x1 == x3)); // Display false
//        System.out.println("x3 == x4 is " + (x3 == x4)); // Display true
//        System.out.println("x3 == x5 is " + (x3 == x5)); // Display true

        System.out.println("--------------------");

        //MAX_VALUE, MIN_VALUE
        //Max_VALUE/MIN_VALUE represents the maximum/minimum byte, short, int, long
        //MIN_VALUE represents the minimum positive float, double
        System.out.println("The maximum integer is " + Integer.MAX_VALUE);
        System.out.println("The minimum positive float is " + Double.MAX_VALUE);
        System.out.println("The minimum positive float is " + Double.MIN_VALUE);

        System.out.println("--------------------");

        //doubleValue(), intValue() to return a double or integer
        int z1 = Double.valueOf(12.4).intValue();
        double z2 = Integer.valueOf(12).doubleValue();

        System.out.println(z1);
        System.out.println(z2);

        System.out.println("--------------------");

        // compareTo() for comparing two String
        // Greater than return 1, less than return -1, Equal to return 0
        int c1 = Integer.valueOf(12).compareTo(Integer.valueOf(12)); //return 0
        int c2 = Integer.valueOf(13).compareTo(Integer.valueOf(14)); //return -1
        int c3 = Integer.valueOf(14).compareTo(Integer.valueOf(13)); //return 1

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("--------------------");

        //parseInt, ParseDouble to convert String to int/double
        String num1 = "12";
        String num2 = "14";

        int result1 = Integer.parseInt(num1) + Integer.parseInt(num2);

        System.out.println(result1);

        //valueOf() to convert int/Double to String
        int num3 = 12;
        int num4 = 14;

        String result2 = String.valueOf(num3) + String.valueOf(num4);

        System.out.println(result2);
    }
}
