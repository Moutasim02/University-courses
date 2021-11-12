package com.structured_programming_SWE201.Project;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ShoppingSystem {
    int selectedItemNumber =0;
    public static void main(String[] args ) {
        Scanner khaled = new Scanner(System.in);
        String electronics [] = {
            "1- 4K Tv $1000\n",
            "2- Phone $500\n",
            "3- Camera $750\n", 
            "4- Printer $250\n",
            "5- Laptop $1250"};
        String clothes [] = {
            "1- Shirt $50\n",
            "2- Pant $65\n",
            "3- Jacket $90\n", 
            "4- Suit $275\n",
            "5- Shoes $35"};
        String food [] = {
            "1- Rice $10\n",
            "2- Flour $3\n",
            "3- Juice $2\n",
            "4- Chicken $7\n",
            "5- Fish $9"};
        String enterntainment [] = {
            "1- PS5 $499\n",
            "2- LEGO $120\n",
            "3- Football $25\n",
            "4- Card $5\n",
            "5- Skateboard $65"};

            
            System.out.println( "PLease select one of the following categories (1 to 4): \n"
            + "1- Electronics\n" + "2- Clothes\n" + "3- Food\n" + "4- Enterntainment");            
            int input = khaled.nextInt();


            switch (input) {
                case 1: 
                System.out.println("Please select one of the following items: ");
                for(int i =0; i< electronics.length; i++){
                    System.out.print(electronics[i]);
                    }
                break;

                case 2:
                System.out.println("Please select one of the following items: ");
                for(int i =0; i< clothes.length; i++){
                    System.out.print(clothes[i]);
                    }
                break;

                case 3:
                System.out.println("Please select one of the following items: ");
                for(int i =0; i< food.length; i++){
                    System.out.print(food[i]);
                    }
                break;

                case 4:                
                System.out.println("Please select one of the following items: ");
                for(int i =0; i< enterntainment.length; i++){
                    System.out.print(enterntainment[i]);
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

