package com.programming_II_CSC202.Lectures.ChapterEleven;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        // Create a list to store cities
        ArrayList<String> cityList = new ArrayList<>();

        // Add some cities in the list
        cityList.add("London");
        // cityList now contains [London]
        cityList.add("Denver");
        // cityList now contains [London, Denver]
        cityList.add("Paris");
        // cityList now contains [London, Denver, Paris]
        cityList.add("Miami");
        // cityList now contains [London, Denver, Paris, Miami]
        cityList.add("Seoul");
        // contains [London, Denver, Paris, Miami, Seoul]
        cityList.add("Tokyo");
        // contains [London, Denver, Paris, Miami, Seoul, Tokyo]
        cityList.add("Dubai");
        // contains [London, Denver, Paris, Miami, Seoul, Tokyo,Dubai]

        for (int i = 0; i < cityList.size(); i++) {
            System.out.print(cityList.get(i) + " ");

        }
        System.out.println("\n");
        System.out.println(cityList);
/*
	    cityList.set(0, "Dubai");
	    System.out.println(cityList);
	    System.out.println(cityList.lastIndexOf("Dubai"));
	    cityList.remove(cityList.lastIndexOf("Dubai"));
*/
        cityList.add(2, "Cairo");
        System.out.println(cityList);

        cityList.add(0, "Abu Dhabi");
        System.out.println(cityList);

        System.out.println("List size? " + cityList.size());
        System.out.println("Is Dubai in the list? " +
                cityList.contains("Dubai"));
        cityList.add("Cairo");
        System.out.println(cityList);
        System.out.println("The location of Cairo in the list? "
                + cityList.indexOf("Cairo"));
        System.out.println("The location of Cairo in the list? "
                + cityList.lastIndexOf("Cairo"));
        System.out.println("Is the list empty? " +
                cityList.isEmpty()); // Print false
        cityList.remove(9);
        System.out.println(cityList);
        cityList.clear();
        System.out.println("Is the list empty? " +
                cityList.isEmpty());
/*
	    // Insert a new city at index 2
	    cityList.add(2, "Xian");
	    // contains [London, Denver, Xian, Paris, Miami, Seoul, Tokyo]

	    // Remove a city from the list
	    cityList.remove("Miami");
	    // contains [London, Denver, Xian, Paris, Seoul, Tokyo]

	    // Remove a city at index 1
	    cityList.remove(1);
	    // contains [London, Xian, Paris, Seoul, Tokyo]

	    // Display the contents in the list
	    System.out.println(cityList.toString());

	    // Display the contents in the list in reverse order
	    for (int i = cityList.size() - 1; i >= 0; i--)
	      System.out.print(cityList.get(i) + " ");
	    System.out.println();
*/
        // Create a list to store two circles
        ArrayList<Circle> list = new ArrayList<>();


        // Add two circles
        list.add(new Circle());
        list.add(new Circle(3));

        list.get(0).setRadius(6);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getArea());
        }

        // Display the area of the first circle in the list
        System.out.println("The area of the circle? " +
                list.get(0).getArea());

    }
}
