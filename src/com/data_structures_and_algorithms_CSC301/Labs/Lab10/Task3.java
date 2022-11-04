package com.data_structures_and_algorithms_CSC301.Labs.Lab10;

/**
 * Moutasim El Ayoubi - 1080415
 */
public class Task3 {
    public static void main(String[] args) {
        //check if Array is Sorted
        int array[] = {213, 23, 24, 35, 23};

        boolean checkArrayOrder = isItSorted(array); //call the function

        System.out.print(checkArrayOrder);
    }

    public static boolean isItSorted(int array[]) {
        return isItSorted(array, 0);//???

    }

    private static boolean isItSorted(int arr[], int start) {
        if(start == arr.length -1) 	return true;
        if(arr[start] > arr[start+1])	return false;
        return isItSorted(arr, start+1);
    }
}
