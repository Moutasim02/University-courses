package com.structured_programming_SWE201.Project;

import java.util.*;


public class ShopifyCLI {
    
    static String electronics [] = {
        "1- 4K Tv $1000",
        "2- Phone $500",
        "3- Camera $750", 
        "4- Printer $250",
        "5- Laptop $1250",
        "6- Main Menu"};
    static String clothes [] = {
        "1- Shirt $50",
        "2- Pant $65",
        "3- Jacket $90", 
        "4- Suit $275",
        "5- Shoes $35",
        "6- Main Menu"};    
    static String food [] = {
        "1- Rice $10",  
        "2- Flour $3",
        "3- Juice $2",
        "4- Chicken $7",
        "5- Fish $9",
        "6- Main Menu"};
    static String enterntainment [] = {
        "1- PS5 $499",
        "2- LEGO $120",
        "3- Football $25",
        "4- Card $5",
        "5- Skateboard $65",
        "6- Main Menu"};
    static ArrayList<Integer> itemsPicked = new ArrayList<Integer>();
    static Scanner khaled = new Scanner(System.in);
    public static void main(String[] args ) {
          mainMenu();
    }
    public static void mainMenu() {
        System.out.println( "PLease select one of the following categories (1 to 4): \n"
        + "1- Electronics\n" + "2- Clothes\n" + "3- Food\n" + "4- Enterntainmen\n" + "5- Cart");            
        int input = khaled.nextInt();
        switch (input) {
            case 1: 
            System.out.println("Please select one of the following items: ");
            for(int i =0; i< electronics.length; i++){
                System.out.print(electronics[i] + "\n");
                }
            for (int i = 0; i <= 6; i++) {
                input = khaled.nextInt();
                if (input == 1)
                    itemsPicked.add(1000);
                if (input == 2)
                    itemsPicked.add(500);
                if (input == 3) 
                    itemsPicked.add(750);
                if (input == 4)
                    itemsPicked.add(250);
                if (input == 5)
                    itemsPicked.add(1250);
                if (input == 6) 
                    mainMenu();
                
            }
            System.out.println(itemsPicked);
            break;

            case 2:
            System.out.println("Please select one of the following items: ");
            for(int i =0; i< clothes.length; i++){
                System.out.print(clothes[i] + "\n");
                }
            break;

            case 3:
            System.out.println("Please select one of the following items: ");
            for(int i =0; i< food.length; i++){
                System.out.print(food[i] + "\n");
                }
            break;

            case 4:                
            System.out.println("Please select one of the following items: ");
            for(int i =0; i< enterntainment.length; i++){
                System.out.print(enterntainment[i] + "\n");
                }
            break;
            
            default: 
            while (true) {
                System.out.print("Error! Please select from 1 to 4 \n" +
                        "> ");
                input = khaled.nextInt();
                if(input > 4 && input < 1){
                System.out.print("Error! Please select from 1 to 4 \n" +
                        "> ");
                input = khaled.nextInt();
                } else {

                    break; //Fix the else statement to go back to the categories menu
                }
                continue;                        
            }
        }
    }
}

