package com.programming_II_CSC202.Labs.Lab_8.task_3;

import java.util.ArrayList;
import java.util.Collections;

// Moutasim El Ayoubi 1080415
public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("bmw", 180);
        Car c2 = new Car("mercedes", 260);
        ArrayList<Car> array = new ArrayList<>();
        array.add(c1);
        array.add(c2);

        // before sorting
        for (Car c : array) {
            System.out.println(c.getSpeed());
        }

        Collections.sort(array); // use the method sort() in java.util.Collection to sort the elements in the list
        for (Car c : array) {
            System.out.println(c.getSpeed());
        }
    }
}

