package com.data_structures_and_algorithms_CSC301.random;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxTenElements {
  /*  private static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(100, 20, 50, 2, 7, 25, 10, 60, 75, 105, 200, 1));
        int[] neededArray = maxTenElements(arr);
        System.out.println(Arrays.toString(neededArray));
    }

    static int[] maxTenElements(ArrayList<Integer> arr) {
        int[] finalArr = new int[10];
        int max = arr.get(0);
        for (int i = 0; i < finalArr.length; i++) {
            for (int j = 1; j < arr.size(); j++) {
                if (arr.get(j) > max && canBeAssigned(arr.get(j), arr)) {
                    max = arr.get(j);
                }
            }
            finalArr[i] = max;
        }
        return finalArr;
    }

    private static boolean canBeAssigned(Integer integer, ArrayList arr) {
        if (arr.contains(integer)) {
            return true;
        }
        return false;
    }*/

}
