package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1;

import com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1.classifications.*;
import java.util.ArrayList;
import java.util.Scanner;

public class VirusMS {
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
                    break;
                case 2:
                    for (int i = 0; i < researchLabs.size(); i++) {
                        System.out.println(i + "- " + researchLabs.get(i));
                    }
                    System.out.print("Which research lab do you want to add the virus to: ");
                    int labChoice = Integer.parseInt(input.nextLine());
                    addVirusToLab(labChoice);
                    break;
                case 3:
                    System.out.print("Which virus you want to list all its lab instances? \n> ");
                    String userVirusName = String.valueOf(input.nextLine());
                    listAllResearchLabs(userVirusName);
                    break;
                case 4:
                    System.out.print("Which category you want to delete all viruses? \n> ");
                    String userCategory = String.valueOf(input.nextLine());
                    deleteAllViruses(userCategory);
                    break;
                case 5:
                    System.out.print("Which virus you want to search for? \n> ");
                    String usVName = String.valueOf(input.nextLine());
                    search4Virus(usVName);
                    break;

                default:
                    System.out.println("Thank you for using CSC301's Virus Management System, Good Bye.");
            }
        } while (userChoice != 0);
    }

    public static void displayMenu() {
        System.out.println(Constants.ANSI_BLUE + "---------------------------------------------------------");
        System.out.print("""
                𝕍𝕚𝕣𝕦𝕤 𝕄𝕒𝕟𝕒𝕘𝕖𝕞𝕖𝕟𝕥 𝕊𝕪𝕤𝕥𝕖𝕞 𝕗𝕠𝕣 {ℂ𝕊ℂ𝟛𝟘𝟙, 𝔽𝕒𝕝𝕝𝟚𝟘𝟚𝟚}
                 """);
        System.out.println("---------------------------------------------------------" + Constants.ANSI_RESET);
        System.out.println(Constants.ANSI_GREEN + "1- Create a new Research Lab");
        System.out.println("2- Add a new Virus to a research Lab");
        System.out.println("3- List all research Labs storing a particular virus");
        System.out.println("4- Delete all existing viruses from a given category in a research Lab");
        System.out.println("5- Check if a particular virus exists based on its official name");
        System.out.println("0- Quit");
        System.out.println("---------------------------------------------------------" + Constants.ANSI_RESET);
    }

    public static int userMenuChoice() {
        Scanner userChoice = new Scanner(System.in);
        int choice;
        do {
            System.out.println(Constants.ANSI_BLUE + "Your choice (0, 1, 2, 3, 4, 5):" + Constants.ANSI_RESET);
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

        System.out.println(Constants.ANSI_RED + """
                ---------------------------
                        𝕍𝕚𝕣𝕦𝕤 𝔻𝕖𝕥𝕒𝕚𝕝𝕤
                ---------------------------
                """ + Constants.ANSI_RESET);
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

        System.out.print(Constants.ANSI_RED + """
                ---------------------------
                   𝕎𝕙𝕒𝕥 𝕥𝕪𝕡𝕖 𝕠𝕗 𝕧𝕚𝕣𝕦𝕤 𝕚𝕤 𝕚𝕥?
                ---------------------------
                """);
        System.out.print(Constants.ANSI_GREEN + """
                     1- dsDNA
                     2- dsRNA
                     3- ssDNA
                     4- ssRNA
                     5- dsDNA-RT: Reverse Transcriptase
                     6- ssRNA-RT: Reverse Transcriptase
                """ + Constants.ANSI_RESET);
        System.out.print("> ");

        int classification;
        do {
            classification = sc.nextInt();
        } while (classification < 0 || classification > 6);

        /*
         * 1- get from the researchLab arraylist the index that user specified
         * 2- access the viruses arraylist from researchlab class and add the new object of this classification
         */
        if (classification == 1)
            researchLabs.get(labChoice).viruses.add(new DsDNA(virusName, symptoms, bodySample, bodySystemEffect, virusDiscoveredBy, virusDiscoveryYear));
        else if (classification == 3)
            researchLabs.get(labChoice).viruses.add(new SsDNA(virusName, symptoms, bodySample, bodySystemEffect, virusDiscoveredBy, virusDiscoveryYear));
        else if (classification == 4)
            researchLabs.get(labChoice).viruses.add(new SsRNA(virusName, symptoms, bodySample, bodySystemEffect, virusDiscoveredBy, virusDiscoveryYear));
        else if (classification == 5)
            researchLabs.get(labChoice).viruses.add(new DsDNA_RT(virusName, symptoms, bodySample, bodySystemEffect, virusDiscoveredBy, virusDiscoveryYear));
        else if (classification == 6)
            researchLabs.get(labChoice).viruses.add(new SsRNA_RT(virusName, symptoms, bodySample, bodySystemEffect, virusDiscoveredBy, virusDiscoveryYear));
    }

    public static void listAllResearchLabs(String userVirusName) {
        for (int i = 0; i < researchLabs.size(); i++) {
            // loop through the whole viruses list to identify if the VirusName exist in this particular lab
            for (int j = 0; j < researchLabs.get(i).viruses.size(); j++) {
                if (userVirusName.equals(researchLabs.get(i).viruses.get(j).getVirusName())) {
                    System.out.println(researchLabs.get(i));
                }
            }
        }
    }

    public static void deleteAllViruses(String userCategory) {
        ResearchLab rl = new ResearchLab();
        rl.deleteInstancesOfViruses(userCategory);
        System.out.println("Done deleting all viruses in " + userCategory + " category");
    }

    public static void search4Virus(String userVirusName) {
        ResearchLab rl = new ResearchLab();
        rl.search4Virus(userVirusName);
    }
}