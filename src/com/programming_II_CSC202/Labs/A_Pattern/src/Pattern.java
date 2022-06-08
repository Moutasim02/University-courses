package com.programming_II_CSC202.Labs.A_Pattern.src;

public class Pattern {
    public static void main(String[] args) {
        int n = 25;
        int z = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = i - 1; k >= -(i - 1); k--) {
                System.out.print((char) (z - Math.abs(k) + 65));
            }
            z += 2;
            System.out.println();
        }
    }
}
