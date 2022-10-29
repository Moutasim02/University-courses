package com.data_structures_and_algorithms_CSC301.Labs.Lab9;

/**
 * Moutasim El Ayoubi - 1080415
 */
public class T1 {
    public static void main(String[] args) {
            // Function calling
            System.out.println(sumTo(5));
    }

    static int sumTo(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumTo(n - 1);
    }
}


