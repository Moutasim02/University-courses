package com.structured_programming_SWE201.Chapter4.SelfLearning;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class MathClass {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Class constants");
        System.out.println("Pi is equal to: " + Math.PI); // PI Math class constant
        System.out.println("E is equal to: " + Math.E); // E Math class constant

        System.out.println(" ");
        System.out.println("Trigonometric Methods");
        System.out.println("sin of 45 in radian is: " + Math.sin(45));
        System.out.println("cos of 45 in radian is: " + Math.cos(45));
        System.out.println("tan of 45 in radian is: " + Math.tan(45));
        System.out.println("inverse sin of 45 in radian is: " + Math.asin(45)); //NaN
        System.out.println("inverse cosine of 45 in radian is: " + Math.acos(45));//NaN
        System.out.println("inverse tan of 45 in radian is: " + Math.atan(45));

        System.out.println(" ");
        System.out.println("Exponent Methods");
        System.out.println("output of e to power 6 is: " + Math.exp(6));
        System.out.println("output of log10(6) is: " + Math.log10(6));
        System.out.println("output of ln(6) to power 6 is: " + Math.log(6));
        System.out.println("output of 2 to the power of 4 is: " + Math.pow(2,4));
        System.out.println("output of squareroot of 6  is: " + Math.sqrt(6));

        System.out.println(" ");
        System.out.println("Rounding Methods");
        System.out.println("Rounded up integer from double value is: " +Math.ceil(35.1));//36.0
        System.out.println("Rounded down integer from double value is: " +Math.floor(35.7));//35.0
        System.out.println("Rounded to even integer from double value is: " +Math.rint(11.5));//12.0
        System.out.println("Regular rounding from float number will look like this: " +Math.round(14.3));//14

        System.out.println(" ");
        System.out.println("min, max, and abs");
        int n1 = 2, n2=4, n3=77, n4 = 23, n5 = 54, n6 = 13;
        System.out.println("max from multiple numbers: " + Math.max(Math.max(Math.max(n1, n2), Math.max(n3, n4)), Math.max(n5, n6))); //77
        System.out.println("min from multiple numbers: " + Math.min(Math.min(Math.min(n1, n2), Math.min(n3, n4)), Math.min(n5, n6))); //2
        System.out.println("absolute value of -2.5 is: " + Math.abs(-2.5)); //2.5

        System.out.println("a random number from 0.0 to 1.0: " + Math.random());
        System.out.println("a random integer between 0 aned 9: " + (int) Math.random() * 10);
        System.out.println("a random integer between 50 and 99: " + (int) (Math.random() * 50)+50);
        int min=0, max=9;
        int rand_int = (int)(Math.random()*((max-min)+1))+min;
        System.out.println("Random Integers: "+rand_int);

        System.out.println(" ");
        System.out.println("methods testing");
        char ch = 'Z';
        System.out.println("ch is digit?: " + isDigit(ch));
        System.out.println("ch is letter?: " + isLetter(ch));
        System.out.println("ch is isLetterOrDigit?: "  + Character.isLetterOrDigit(ch));
        System.out.println("ch is isLowercase?: " + Character.isLowerCase(ch));
        System.out.println("ch is isUppercase?: " + Character.isUpperCase(ch));
        System.out.println("ch is toUppercase?: " + Character.toUpperCase(ch));
        System.out.println("ch is toLowercase?: " + Character.toLowerCase(ch));
        if (ch >= 'A' && ch <= 'Z')
            System.out.println(ch + " is an uppercase letter");
        else if (ch >= 'a' && ch <= 'z') //notice the logical operators used too
            System.out.println(ch + " is a lowercase letter");
        else if (ch >= '0' && ch <= '9')
            System.out.println(ch + " is a numeric character");
    }
}
