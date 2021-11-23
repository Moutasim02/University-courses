package com.structured_programming_SWE201.Chapter6.AssignmentTwo;

import java.util.Scanner;

public class DiceRoll {
    //As long as we are going to access these only in this class will make it private, just practicing some OOP stuff :)
    private static int count_1 = 0, count_2 = 0, count_3 = 0, count_4 = 0, count_5 = 0, count_6 = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How  many  times  would  you  like  to  throw  the  dice  :  ");
        int roll = input.nextInt();
        int[] dice = new int[roll];
        // loop to have 6 random numbers for each dice
        for (int i = 0; i < roll; i++) {
            int value = (int) (1 + (Math.random() * 6));
            dice[i] = value;
        }
        System.out.println("\nRolling  the  dice  " + roll + "  times");
        get_Face_Moutasim_05(dice);
    }


    public static void get_Face_Moutasim_05(int[] dice) {
        // Declaring number of counts (6) as required
        int arr[] = new int[6];
        int i, j;

        for (i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                count_1++;
            } else if (dice[i] == 2) {
                count_2++;
            } else if (dice[i] == 3) {
                count_3++;
            } else if (dice[i] == 4) {
                count_4++;
            } else if (dice[i] == 5) {
                count_5++;
            } else if (dice[i] == 6) {
                count_6++;
            }
        }

        arr[0] = count_1;
        arr[1] = count_2;
        arr[2] = count_3;
        arr[3] = count_4;
        arr[4] = count_5;
        arr[5] = count_6;

        System.out.println("Dice with 1 point face: " + count_1);
        System.out.println("Dice with 2 point face: " + count_2);
        System.out.println("Dice with 3 point face: " + count_3);
        System.out.println("Dice with 4 point face: " + count_4);
        System.out.println("Dice with 5 point face: " + count_5);
        System.out.println("Dice with 6 point face: " + count_6);

        i = 0;
        j = 0;
        // Display the repetitive frequency
        if (i < 6) {
            do {
                j = i + 1;
                while (j < 6) {
                    if (arr[i] == arr[j]) {
                        System.out.println("The faces with repeated frequency are:  " + (i + 1) + " and " + (j + 1));
                        break;
                    }
                    j++;
                }
                if (j != 6) {
                    break;
                }
                i++;
            } while (i < 6);
        } // we could have used while or for loops but just for practicing purposes

        // Display non-repetitive frequencies if any
        switch (i) {
            case 6:
                System.out.println("The faces with repeated frequency are: None");
                break;
        }

    }
}
