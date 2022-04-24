package com.programming_II_CSC202.Lectures.ChapterTen;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigIntegerAndBigDecimal {
    public static void main(String[] args) {
        int number = Integer.MAX_VALUE;
        System.out.println(number * 2);//WRONG

        BigInteger number1 = new BigInteger("2147483647");
        BigInteger number2 = new BigInteger("2");
        System.out.println(number1.multiply(number2));
        System.out.println(number1.divide(number2));
        System.out.println(number1.add(number2));
        System.out.println(number1.subtract(number2));


        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("3");
        BigDecimal c = a.divide(b, 5, RoundingMode.CEILING);
        System.out.println(c);

    }
}
