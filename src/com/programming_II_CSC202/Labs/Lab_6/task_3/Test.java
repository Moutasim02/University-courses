package com.programming_II_CSC202.Labs.Lab_6.task_3;//Ahmad Nasser
//Task 3
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    // Moutasim El Ayoubi - 1080415
    public static void main(String[] args) {
        //create an arryList of cities
        ArrayList<String> cities = new ArrayList<>();

        //Adding items to the arraylist
        cities.add("Abu Dhabi");
        cities.add("Al Ain");
        //Add also the following cities: Dubai, RAK, Ajman
        cities.add("Dubai");
        cities.add("RAK");
        cities.add("Ajman");

        //Accessing an item in the Arraylist
        System.out.println(cities.get(1));
        System.out.println("----------------------------------");

        //looping through the list using the get(index) method
        for(int i = 0; i < cities.size(); i++){
            System.out.println(cities.get(i));
        }

        //modifying an element in the item
        cities.set(1, "Sharjah");
        System.out.println("----------------------------------");

        //another way of looping through the list
        for(String x: cities)
                System.out.println(x);

        //remove an item
        cities.remove(0);
        System.out.println("----------------------------------");

        //sorting  a list
        Collections.sort(cities);
        for(String x: cities)
                System.out.println(x);

       cities.clear();
    }
}
