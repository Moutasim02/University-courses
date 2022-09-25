package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1;

import java.util.*;
public class Two_Dimensional_ArrayLists{
    public static void main(String args[]) {
// The arraylist of 2d format will be declared here
        ArrayList<ArrayList<Integer> > array_list = new ArrayList<ArrayList<Integer> >();
// The space for the 0th row can be allocated with the use of new keyword, this is done in this line. The 0th row also allows the store of 0 value as default .
        array_list.add(new ArrayList<Integer>());
// next the default value of 1 is changed to 13 here.
        array_list.get(1).add(0, 13);
        System.out.println("2D ArrayList… :");
        System.out.println(array_list);
    }
}
