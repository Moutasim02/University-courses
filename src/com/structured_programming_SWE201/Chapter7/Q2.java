package com.structured_programming_SWE201.Chapter7;

import java.util.Scanner;
import java.util.Random;
public class Q2{

    // driver method
    public static void main(String args[]) {
        // initialize shoppingCart array with size 10
        int ShoppingCart[] = new int[10];
        // initialize itemsNames with size 10 and school stationary products
        String itemsNames[] = {"pancil", "eraser", "pen", "marker", "jacket", "highlighter", "lunchboxes", "book", "sharpener",
            "whitener"};
        // called printMainMenu to show menu
        printMainMenu(itemsNames, ShoppingCart);
    }

// printMainMenu method that will print main menu and get user input and perform accordingly
    public static void printMainMenu(String itemsNames[], int ShoppingCart[]) {
        // initialize scanner object to read user's input
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String entry = "";
        // do while loop to run infinite till user give 0 input
        do {
            // print menu
            System.out.println(
                    "\n\t1: Create new price for each item in in the Cart list.\n\t2: Print the price of particular item.\n\t0: Exit");
            System.out.print("\nEnter your choice.: ");
            // read user input
            entry = scanner.next();
            // switch controle that will compare user input
            switch (entry) {
                case "1":
                    // if user press
                    // call setPriceOfItemsRandomly to set price of items randomly
                    setPriceOfItemsRandomly(ShoppingCart);
                    break;
                case "2":
                    // if user press 2
                    // call printPriceOfParticularItem to print price of particular item
                    printPriceOfParticularItem(itemsNames, ShoppingCart);
                    break;
                case "0":
                    // if user give 0 input then quit the program
                    flag = false;
                    break;
                default:
                    // if user gave wrong input then display message wrong input
                    System.out.print("please enter valid input: ");
            }
        } while (flag);
    }

    // method setPriceOfItemsRandomly that will rendoly assign price to each item
    public static void setPriceOfItemsRandomly(int ShoppingCart[]) {
        for (int i = 0; i < ShoppingCart.length; i++) {
            ShoppingCart[i] = (int)(1 + Math.random() * 1000);
        }
    }

    public static void displayItemes(String itemsNames[], int ShoppingCart[]) {
        System.out.println();
        int i = 0;
        while (i < itemsNames.length) {
            System.out.println((i + 1) + ". " + itemsNames[i]);

            i++;
        }
    }

    // printPriceOfParticularItem method will print item's price and item's name
    public static void printPriceOfParticularItem(String itemsNames[], int ShoppingCart[]) {
        Scanner scanner = new Scanner(System.in);
        displayItemes(itemsNames, ShoppingCart);
        System.out.print("\n\nEnter Item name: ");
        String item = scanner.next();
        int i = 0;
        while (i < itemsNames.length) {
            if (itemsNames[i].equals(item)) {
                System.out.println("\nthe Price of " + itemsNames[i] + "is " + ShoppingCart[i] + "\n");
                break;
            }
            i++;
        }
    }
}
