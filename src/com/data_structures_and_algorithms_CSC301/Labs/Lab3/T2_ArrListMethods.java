package com.data_structures_and_algorithms_CSC301.Labs.Lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class T2_ArrListMethods {
    public static void main(String[] args) {
        String[] array = {"Messi", "Cristiano", "Neymar", "Xavi", "Bale"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("My Players: " + list);


        //set and get
        list.set(2, "Moutasim");
        System.out.println("the player at index 2 is: " + list.get(2));

        System.out.println("Messi is at index  " + list.indexOf("Messi"));
        System.out.println("lastIndexOf Messi " + list.lastIndexOf("Messi"));

        //functions of the Collection Class
        Collections.sort(list);
        System.out.println("After sorting: " + list);
        System.out.println(Collections.max(list));
        Collections.shuffle(list);
        System.out.println("After shuffeling: " + list);

        //all functions related to removing elements
        list.remove(3); //or list.remove("RAK");
        System.out.println(list);
        list.clear();
        System.out.println(list.isEmpty());
    }
}
