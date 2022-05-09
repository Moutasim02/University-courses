package com.programming_II_CSC202.Labs.Lab_6.task_4;//Ahmad Nasser
//Task 4
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class Test {
    // Moutasim El Ayoubi - 1080415
    public static void main(String[] args) {
        Integer[] myNumbers = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(myNumbers));

        //finding the maximum 
        System.out.println("The maximum is " + Collections.max(list));
        //write a code to the minimum number in myNumbers list
        System.out.println("The minimum is " + Collections.min(list));

        //shuffling the list
        System.out.println("This is shuffled");

        //use the method shuffle() to shuffle the elements in the list
        Collections.shuffle(list);
        System.out.println(list);


        //sorting the list
        System.out.println("This is sorted");

        //use the method sort()  in java.util.Collection to sort the   elements in the list
        Collections.sort(list);
        System.out.println(list);

    }
}
