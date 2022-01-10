package com.structured_programming_SWE201.Chapter7;

public class Q1{

    public static void main(String args[]) {
        // initializing arrayInteger
        int arrayInteger[][] = {{0, 1, 0}, {1, 1, 0}};
        int i, j;
        // first while loop that will run through row of array
        i = 0;
        while (i < arrayInteger.length) {
            j = 0;
            // sencond while loop that will run throw columns of array
            while (j < arrayInteger[i].length) {
                // check if array's i, j location have 1
                if (arrayInteger[i][j] == 1) {
                    // then print Yes it is right
                    System.out.print(arrayInteger[i][j] + ", YES it is right ");
                   // check if array's i,j location have 0
                } else if (arrayInteger[i][j] == 0) {
                    // then print No it is wrong
                    System.out.print(arrayInteger[i][j] + ", NO it is wrong  ");
                }
                j++;
            }
            // after each row print new line
            System.out.print("\n");
            i++;
        }

    }

}
