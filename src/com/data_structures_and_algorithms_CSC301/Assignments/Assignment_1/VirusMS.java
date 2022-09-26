package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1;

import com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1.classifications.*;

import java.util.ArrayList;
import java.util.Scanner;

public class VirusMS {
    // Colors
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";


    static ArrayList<ResearchLab> researchLabs = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userChoice;
        do {
            displayMenu();
            userChoice = userMenuChoice();
            switch (userChoice) {
                case 1:
                    addResearchLab();
                    break;        // 1-	Create a new Research Lab
                case 2:
                    for (int i = 0; i < researchLabs.size(); i++) {
                        System.out.println(i + "- " + researchLabs.get(i));
                    }
                    System.out.println("Which Lab you want to add to: ");
                    int labChoice = Integer.parseInt(input.nextLine());
                    addVirusToLab(labChoice);
                    break;            // 2-	Add a new Virus to research Lab
                case 3:
                    System.out.print("Which virus you want to list all its lab instances? \n> ");
                    String userVirusName = String.valueOf(input.nextLine());
                    listAllResearchLabs(userVirusName);
                    break;    // 3-	List all research Labs storing a particular virus
                case 4:
                    System.out.print("Which category you want to delete all viruses? \n> ");
                    String userCategory = String.valueOf(input.nextLine());
                    deleteAllViruses(userCategory);
                    break;        // 4-	Delete all existing viruses from a given a category in research Lab
                case 5:
                    System.out.print("Which virus you want to search for? \n> ");
                    String usVName = String.valueOf(input.nextLine());
                    search4Virus(usVName);
                    break;            // 5-	Check if a particular virus exists based on its official name

                default:
                    System.out.println("Thank you for using CSC301's Virus Management System, Good Bye.");
            }
        } while (userChoice != 0);
    }

    public static void displayMenu() {
        System.out.println(ANSI_BLUE + "---------------------------------------------------------");
        System.out.println("Virus Management System {CSC301, Fall2022}");
        System.out.println("---------------------------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "1- Create a new Research Lab");
        System.out.println("2- Add a new Virus to a research Lab");
        System.out.println("3- List all research Labs storing a particular virus");
        System.out.println("4- Delete all existing viruses from a given category in a research Lab");
        System.out.println("5- Check if a particular virus exists based on its official name");
        System.out.println("0- Quit");
        System.out.println("---------------------------------------------------------" + ANSI_RESET);
    }

    public static int userMenuChoice() {
        Scanner userChoice = new Scanner(System.in);
        int choice;
        do {
            System.out.println(ANSI_BLUE + "Your choice (0, 1, 2, 3, 4, 5):" + ANSI_RESET);
            choice = userChoice.nextInt();
        } while (choice > 5);
        return choice;
    }

    public static void addResearchLab() {
        Scanner khaled = new Scanner(System.in);
        System.out.print("Add category: ");
        String category = khaled.nextLine();
        System.out.print("Add location: ");
        String location = khaled.nextLine();
        System.out.print("Add size: ");
        int size = khaled.nextInt();
        researchLabs.add(new ResearchLab(category, location, size));
    }

    public static void addVirusToLab(int labChoice) {
        Scanner sc = new Scanner(System.in);

        System.out.println(ANSI_RED + """
                --------------------------
                      Virus Details
                --------------------------
                """ + ANSI_RESET);
        System.out.print("Virus Name: ");
        String virusName = sc.nextLine();
        System.out.print("Symptoms: ");
        String symptoms = sc.nextLine();
        System.out.print("Body Sample: ");
        String bodySample = sc.nextLine();
        System.out.print("System Effect: ");
        String bodySystemEffect = sc.nextLine();
        System.out.print("Discovered by: ");
        String virusDiscoveredBy = sc.nextLine();
        System.out.print("Discovery year: ");
        int virusDiscoveryYear = Integer.parseInt(sc.nextLine());

        System.out.print(ANSI_RED + """
                ---------------------------
                 What type of virus is it?
                ---------------------------
                """);
        System.out.print(ANSI_GREEN + """
                     1- dsDNA
                     2- dsRNA
                     3- ssDNA
                     4- ssRNA
                     5- dsDNA-RT: Reverse Transcriptase
                     6- ssRNA-RT: Reverse Transcriptase
                """ + ANSI_RESET);
        System.out.print("> ");

        int classification;
        do {
            classification = sc.nextInt();
        } while (classification < 0);

        if (classification == 1) {
            researchLabs.get(labChoice).viruses.add(new DsDNA(virusName, symptoms, bodySample, bodySystemEffect, virusDiscoveredBy, virusDiscoveryYear));
        } else if (classification == 2) {
            researchLabs.get(labChoice).viruses.add(new DsRNA(virusName, symptoms, bodySample, bodySystemEffect, virusDiscoveredBy, virusDiscoveryYear));
        } else if (classification == 3) {
            researchLabs.get(labChoice).viruses.add(new SsDNA(virusName, symptoms, bodySample, bodySystemEffect, virusDiscoveredBy, virusDiscoveryYear));
        } else if (classification == 4) {
            researchLabs.get(labChoice).viruses.add(new SsRNA(virusName, symptoms, bodySample, bodySystemEffect, virusDiscoveredBy, virusDiscoveryYear));
        } else if (classification == 5) {
            researchLabs.get(labChoice).viruses.add(new DsDNA_RT(virusName, symptoms, bodySample, bodySystemEffect, virusDiscoveredBy, virusDiscoveryYear));
        } else if (classification == 6) {
            researchLabs.get(labChoice).viruses.add(new SsRNA_RT(virusName, symptoms, bodySample, bodySystemEffect, virusDiscoveredBy, virusDiscoveryYear));
        }
    }

    public static void listAllResearchLabs(String userVirusName) {
        for (int i = 0; i < researchLabs.size(); i++) {
            for (int j = 0; j < researchLabs.get(i).viruses.size(); j++) {
                if (userVirusName.equals(researchLabs.get(i).viruses.get(j).getVirusName())) {
                    System.out.println(researchLabs.get(i));
                }
            }
        }
    }

    public static void deleteAllViruses(String userCategory) {
        ResearchLab rl = new ResearchLab();
        rl.deleteAllViruses(userCategory);
        System.out.println("Done deleting all viruses in " + userCategory + " category");
    }

    public static void search4Virus(String userVirusName) {
        ResearchLab rl = new ResearchLab();
        rl.search4Virus(userVirusName);
    }
}