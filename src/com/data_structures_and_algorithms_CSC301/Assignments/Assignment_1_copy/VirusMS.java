package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1_copy;

import java.util.ArrayList;
import java.util.Scanner;

public class VirusMS {
    public static void main(String[] args) {
        ArrayList<ResearchLab> rl = new ArrayList<>();

        int userChoice;
        do {
            DislayMenu();
            userChoice = UserMenuChoice();
            switch (userChoice) {
                case 1:
                    AddResearchLab(rl);
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
        System.out.println("4- Delete all existing viruses from a given a category in a research Lab");
        System.out.println("5- Check if a particular virus exists based on its official name");
        System.out.println("0- Quit");
        System.out.println("---------------------------------------------------------");
    }

    public static int UserMenuChoice() {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Your choice (0, 1, 2, 3, 4, 5):");
            choice = input.nextInt();
        } while (choice > 5);
        return choice;
    }

    public static void AddResearchLab(ArrayList<ResearchLab> rl) {
        Scanner input = new Scanner(System.in);
        System.out.print("Category: ");
        String category = input.nextLine();
        System.out.print("Location: ");
        String location = input.nextLine();
        System.out.print("Size: ");
        int size = input.nextInt();
        int i = 0;
        rl.add(i, new ResearchLab(category, location, size));
        i++;
    }

    public static void AddVirusToLab() {
        // To be completed. Feel free to change the input parameters.
    }

    public static void ListAllResearchLabs() {
    }

    public static void DeleteAllViruses() {
        // To be completed. Feel free to change the input parameters.
    }

    public static void Search4Virus() {
        // To be completed. Feel free to change the input parameters.
    }
}