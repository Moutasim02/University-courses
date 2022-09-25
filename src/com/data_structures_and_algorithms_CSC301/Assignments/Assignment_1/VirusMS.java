package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1;

import java.util.Scanner;

public class VirusMS {
    public static void main(String[] args) {

        int userChoice;
        do {
            DislayMenu();
            userChoice = UserMenuChoice();
            switch (userChoice) {
                case 1:
                    AddResearchLab();
                    break;        // 1-	Create a new Research Lab
                case 2:
                    AddVirusToLab();
                    break;            // 2-	Add a new Virus to research Lab
                case 3:
                    ListAllResearchLabs();
                    break;    // 3-	List all research Labs storing a particular virus
                case 4:
                    DeleteAllViruses();
                    break;        // 4-	Delete all existing viruses from a given a category in a research Lab
                case 5:
                    Search4Virus();
                    break;            // 5-	Check if a particular virus exists based on its official name

                default:
                    System.out.println("Thank you for using CSC301's Virus Management System, Good Bye.");
            }
        } while (userChoice != 0);
    }

    public static void DislayMenu() {
        System.out.println("---------------------------------------------------------");
        System.out.println("Virus Management System {CSC301, Fall2022}");
        System.out.println("---------------------------------------------------------");
        System.out.println("1- Create a new Research Lab");
        System.out.println("2- Add a new Virus to a research Lab");
        System.out.println("3- List all research Labs storing a particular virus");
        System.out.println("4- Delete all existing viruses from a given category in a research Lab");
        System.out.println("5- Check if a particular virus exists based on its official name");
        System.out.println("0- Quit");
        System.out.println("---------------------------------------------------------");
    }

    public static int UserMenuChoice() {
        Scanner userChoice = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Your choice (0, 1, 2, 3, 4, 5):");
            choice = userChoice.nextInt();
        } while (choice > 5);
        return choice;
    }

    public static void AddResearchLab() {
        Scanner khaled = new Scanner(System.in);
        System.out.print("Add category: ");
        String category = khaled.nextLine();
        System.out.print("Add location: ");
        String location = khaled.nextLine();
        System.out.print("Add size: ");
        int size = khaled.nextInt();
        new ResearchLab(category, location, size);
    }

    public static void AddVirusToLab() {

    }

    public static void ListAllResearchLabs() {
    }

    public static void DeleteAllViruses() {

    }

    public static void Search4Virus() {

    }
}