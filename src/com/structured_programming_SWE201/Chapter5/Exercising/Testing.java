package com.structured_programming_SWE201.Chapter5.Exercising;

public class Testing {
    public static void main(String[] args) {
        int i = 9, k = 8;
        while (i<17) {
            if ((i+1)%k == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
