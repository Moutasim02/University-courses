package com.data_structures_and_algorithms_CSC301.random;

import java.util.Stack;
// D0ne By MouTasim ..
public class Testing {
    public static void main(String[] args) {
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        stk1.add(1);
        stk1.add(3);
        stk1.add(4);
        stk1.add(5);
        stk1.add(6);
        stk2.addAll(stk1);
//        stk2.remove(3);
//        stk2.add(3, 7);

        System.out.println(stk1);
        System.out.println(stk2);
        boolean bol = areIdentical(stk1, stk2);
        System.out.println(bol);
    }

    private static boolean areIdentical(Stack<Integer> stk1, Stack<Integer> stk2) {
        Stack<Integer> temp1 = new Stack<>();
        temp1.addAll(stk1);
        Stack<Integer> temp2 = new Stack<>();
        temp2.addAll(stk2);

        while (!temp1.isEmpty() || !temp2.isEmpty()) {
            if (temp1.pop() != temp2.pop()) {
                return false;
            }
        }
        return true;
    }
}

