package com.data_structures_and_algorithms_CSC301.Labs.Lab3;

import java.util.ArrayList;
import java.util.Arrays;

public class T1_MaxInArrList {
    public static void main(String[] args) {
        Integer[] myArray = {3, 5, 9, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(myArray));
        System.out.println(max(arrayList));
    }

    public static Integer max(ArrayList<Integer> list) {
        Integer max = list.get(0);
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) > max)
                max = list.get(i);
        }
        return max;
    }
}
