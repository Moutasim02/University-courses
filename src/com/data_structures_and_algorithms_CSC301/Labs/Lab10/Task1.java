package com.data_structures_and_algorithms_CSC301.Labs.Lab10;

import java.util.Scanner;
/**
 * Moutasim El Ayoubi - 1080415
 */
public class Task1 {
    public static void main(String[] args) {
        //finding the power of a number
        // the logic is as follows; for even powers xn/2 * xn/2 and for odd x * xn/2 * xn/2
        // 1.1 Complete PowerV1 and PowerV2
        // 1.2 Test that these two versions are correct by computing 2^8, 2^10, 3^3
        // 1.3 Now compute 2^100000 with both versions. Explain the result you got by analyzing
        // the time complexity of both versions.
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = s.nextInt();
        System.out.println("Enter the power ");
        int n = s.nextInt();
        long startTime = System.nanoTime();
        long result = powerV1(x, n);//call functionV1
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Power(" + x + ", " + n + ") = " + result + " and Execution time = " + elapsedTime + " Nanoseconds");
    }

    private static long powerV1(int x, int n) {
        if (n == 0) return 1;
        else
            return x * powerV1(x, n - 1);
    }

    private static long powerV2(int x, int n) {
        long y;
        if (n == 0) return 1;
        else if (n == 1) return x;
        else {
            y = powerV2(x, n / 2); //consider even case
            y = y * y;
            if (n % 2 == 0) return y;
        }
        return x * y;
    }
}
