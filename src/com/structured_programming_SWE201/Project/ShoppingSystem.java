package com.structured_programming_SWE201.Project;

import java.util.Scanner;

public class ShoppingSystem {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tMENU\t");

        boolean check = true;
        while (check) {
            //prompt the user to choose which option he wants
            System.out.println("PLease select one of the following categories (1 to 4): \n"
                    + "1- Electronics\n" + "2- Clothes\n" + "3- Food\n" + "4- Enterntainment\n" + "5- Cart");
            System.out.print("Select: ");
            int option = sc.nextInt();
            System.out.println("----------------------");

            switch (option) {
                case 1://Electronics
                    int count = 0;
                    String[] electronics = {"1- 4K Tv", "2- Phone", "3- Camera", "4- Printer", "5- Laptop"};

                    for (int i = 0; i < electronics.length; i++)
                        System.out.println(electronics[i]);
                    System.out.print("Select: ");
                    int choice = sc.nextInt();
                    int price = prices(choice, count);
                    System.out.print("Do you want to add " + electronics[choice - 1].substring(3)
                            + " with a price of " + "$" + price + " to the cart (Y or N)? ");
                    String ask = sc.next().toUpperCase().substring(0, 1);

                    if (ask.equals("Y") || ask.equals("y")) {
                        totalPrice += price; // add all the prices
                        totalItems[counter] = electronics[choice - 1].substring(3); // store all items in the totalItems Array
                        pprice[counter] = price;// store all the prices in an array
                        counter++; // To count the number of items the user added
                    }
                    break;
                case 2://Clothes
                    count = 5;
                    String[] clothes = {"1- Shirt", "2- Pant", "3- Jacket", "4- Suit", "5- Shoes"};

                    for (int i = 0; i < clothes.length; i++)
                        System.out.println(clothes[i]);
                    System.out.print("Select: ");
                    choice = sc.nextInt();
                    price = prices(choice, count);
                    System.out.print("Do you want to add " + clothes[choice - 1].substring(3)
                            + " with a price of " + "$" + price + " to the cart (Y or N)? ");
                    ask = sc.next().toUpperCase().substring(0, 1);

                    if (ask.equals("Y") || ask.equals("y")) {
                        totalPrice += price;
                        totalItems[counter] = clothes[choice - 1].substring(3);
                        pprice[counter] = price;
                        counter++;
                    }
                    break;
                case 3://food
                    count = 10;
                    String[] food = {"1- Rice", "2- Flour", "3- Juice", "4- Chicken", "5- Fish"};

                    for (int i = 0; i < food.length; i++)
                        System.out.println(food[i]);
                    System.out.print("Select: ");
                    choice = sc.nextInt();
                    price = prices(choice, count);

                    System.out.print("Do you want to add " + food[choice - 1].substring(3)
                            + " with a price of " + "$" + price + " to the cart (Y or N)? ");
                    ask = sc.next().toUpperCase().substring(0, 1);

                    if (ask.equals("Y") || ask.equals("y")) {
                        totalPrice += price;
                        totalItems[counter] = food[choice - 1].substring(3);
                        pprice[counter] = price;
                        counter++;
                    }
                    break;
                case 4://entertainment
                    count = 15;
                    String[] entertainment = {"1- PS5", "2- LEGO", "3- Football", "4- Card", "5- Skateboard"};

                    for (int i = 0; i < entertainment.length; i++)
                        System.out.println(entertainment[i]);
                    System.out.print("Select: ");
                    choice = sc.nextInt();
                    price = prices(choice, count);
                    System.out.print("Do you want to add " + entertainment[choice - 1].substring(3)
                            + " with a price of " + "$" + price + " to the cart (Y or N)? ");
                    ask = sc.next().toUpperCase().substring(0, 1);

                    if (ask.equals("Y") || ask.equals("y")) {
                        totalPrice += price;
                        totalItems[counter] = entertainment[choice - 1].substring(3);
                        pprice[counter] = price;
                        counter++;
                    }
                    break;
                case 5://
                    cart();
                    check = false;
                    break;
                default:
            }
        }
    }

    static int totalPrice = 0; // summation of all items
    static int[] pprice = new int[20]; // to store all items of user's choice in this array
    static int counter = 0;
    static String[] totalItems = new String[20];

    // Lists all the prices and responsible for adding costs
    public static int prices(int choice, int count) {
        int price = 0;

        int[] cost = {1000, 500, 750, 250, 1250, 50, 65, 90, 275, 35, 10, 3, 2, 7, 9, 499, 120, 25, 5, 65};
        for (int i = 0; i < cost.length; i++) {
            if (count == 0)
                price = cost[choice - 1];
            else if (count == 5)
                price = cost[choice + 4];
            else if (count == 10)
                price = cost[choice + 9];
            else if (count == 15)
                price = cost[choice + 14];
        }

        return price;
    }

    // Total prices in the basket for checkout
    public static void cart() {
        String[] itemsNames = new String[counter];
        int[] priceLabel = new int[counter];
        for (int i = 0; i < itemsNames.length; i++) {
            itemsNames[i] = totalItems[i];
            priceLabel[i] = pprice[i];
            System.out.println(itemsNames[i] + "\t ---> " + priceLabel[i]);
            System.out.println("");
        }
        System.out.println("Total \t\t" + totalPrice);
    }
}