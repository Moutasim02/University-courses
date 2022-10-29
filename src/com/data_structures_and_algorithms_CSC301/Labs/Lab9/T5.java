package com.data_structures_and_algorithms_CSC301.Labs.Lab9;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        //create scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String");
        String s = sc.nextLine();

        System.out.println(countUpperCase(s));
    }

    public static int countUpperCase(String str) {
        if (str.length() == 0) {
            return 0;
        }

        if (Character.isUpperCase(str.charAt(0))) {
            return 1 + countUpperCase(str.substring(1));
        }
        return countUpperCase(str.substring(1));
    }
}
