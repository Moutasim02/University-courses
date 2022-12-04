package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_3;

import java.util.Scanner;

public class TestBST {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("""
                             
                             ██     ██  ██████  ██████  ██████  ███████      ██████  ██████  ██    ██ ███    ██ ████████ ███████ ██████ \s
                             ██     ██ ██    ██ ██   ██ ██   ██ ██          ██      ██    ██ ██    ██ ████   ██    ██    ██      ██   ██\s
                             ██  █  ██ ██    ██ ██████  ██   ██ ███████     ██      ██    ██ ██    ██ ██ ██  ██    ██    █████   ██████ \s
                             ██ ███ ██ ██    ██ ██   ██ ██   ██      ██     ██      ██    ██ ██    ██ ██  ██ ██    ██    ██      ██   ██\s
                              ███ ███   ██████  ██   ██ ██████  ███████      ██████  ██████   ██████  ██   ████    ██    ███████ ██   ██\s
                                      
                """);
        Thread.sleep(1200);

        System.out.printf("Welcome to words counter interactive application 😊%nPlease type the name of the file you want to read: %n> ");

        Scanner sc = new Scanner(System.in);
        // Input
        String fileName = sc.next();


        BST<String> binarySearchTree = new BST<>();
        binarySearchTree.bstFromFileInput(fileName, binarySearchTree);
        System.out.println("Great we are done from reading your file");

        System.out.printf("You can search for a specific word %n> ");
        String word = sc.next();

        //Output
        int occurrences = binarySearchTree.getWordOccurrence(word);
        if (occurrences != 0)
            System.out.printf("The word occurrence(s): %d and can be found in the following lines: %s%n", occurrences, binarySearchTree.getLineOfOccurrence(word).toString());
        else
            System.out.print("Unfortunately the word you inputted is not their");


        System.out.printf("Do you want the full summary of the file? %n1 - Yes %n2 - No%n> ");
        int userChoice = sc.nextInt();
        if (userChoice == 1) {
            binarySearchTree.printFormattedOutput();
            binarySearchTree.getStats();
        } else {
            System.out.print("Thank you for using our word counter service");
            System.exit(0);
        }
    }
}
