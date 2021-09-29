/*
Write a multi-way if/else statement that
adds 1 to the variable minors if the variable age is less than 18,
adds 1 to the variable adults if age is 18 through 64 and
adds 1 to the variable seniors if age is 65 or older.
 */
package com.structured_programming_SWE201.Chapter3.homeworks;
import java.util.Scanner;

public class If_Else {

    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int minors = 0, adults = 0, seniors = 0;
            int age = scanner.nextInt();

            if (age < 18)
                minors++;
            else if (age < 65)
                adults++;
            else
                seniors++;

        }
    }
}
