package com.programming_II_CSC202.Labs.Lab_8.task_4;

import java.util.ArrayList;

// Moutasim El Ayoubi 1080415
public class SortComparableObjects {
    public static void main(String[] args) {
        int[] list1 = {9, 8};
        int[] list2 = list1.clone(); // list2 is a clone of list1

        System.out.println("list1 is " + list1[0] + ", " + list1[1]);
        System.out.println("The cloned list2 is " + list2[0] + ", " + list2[1]);

        ArrayList<String> Alist1 = new ArrayList<>();
        Alist1.add("pink");
        Alist1.add("orange");
        ArrayList<String> Alist2;
        Alist2 = Alist1;

        System.out.println("The string Alist1 is " + Alist1);
        System.out.println("The cloned string Alist2 is " + Alist2);
    }
}
