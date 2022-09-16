package com.data_structures_and_algorithms_CSC301.random;

import java.util.ArrayList;
import java.util.Arrays;

public class FindingMaxTen {
    public static void main(String... args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(100, 20, 50, 2, 7, 25, 10, 60, 75, 105, 200, 1));
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        extractMaxTen(arrayList, arr);
        System.out.println(arrayList);
    }

    private static void extractMaxTen(ArrayList<Integer> arrayList, ArrayList<Integer> arr) {
        for (int i = 0; i < 10; i++) { // O(n)
            int max = findMaxValue(arr);
            arrayList.add(i, max);
            arr.remove(arr.indexOf(max));
        }
    }

    private static int findMaxValue(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 0; i < arr.size() - 1; i++) { // O(n)
            if (arr.get(i + 1) > max) {
                max = arr.get(i + 1);
            }
        }
        return max;
    }
}

