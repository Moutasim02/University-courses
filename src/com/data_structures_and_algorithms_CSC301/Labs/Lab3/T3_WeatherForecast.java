package com.data_structures_and_algorithms_CSC301.Labs.Lab3;

import java.io.*;
import java.util.*;

public class T3_WeatherForecast {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        int value;

        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }

        System.out.println("the original list is: " + list.toString());
        System.out.println("The distinct integers are: " +
                removeDuplicate(list));
    }

    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer x : list) {
            if (!newList.contains(x)) {
                newList.add(x);
            }
        }
        return newList;
    }
}
