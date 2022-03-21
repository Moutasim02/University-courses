package com.programming_II_CSC202.Activities.AssignmentOne;

public class TestAccount {
    private static final String RED = "\u001b[31m";
    private static final String BLUE = "\u001b[34m";

    public static void main(String[] args) {

        Owner owner = new Owner();
        // TODO: Shall we use setters to specify the values for the object? Or just use Non default constructor?
        owner.setId(1122);
        owner.setName("Moutasim El Ayoubi");
        owner.setAddress("MBZ City");

        Account moutasim = new Account();
        moutasim.setBalance(20000);
        moutasim.setAnnualInterestRate(0.045);
        // TODO: "Owner object created in 1 above" Does it mean we should extend class Owner?!

        System.out.println(BLUE + "\nDear " + owner.getName() + " with the ID: " + owner.getId());
        moutasim.withdraw(2500);

        System.out.println("\nDear " + owner.getName() + " with the ID: " + owner.getId());
        moutasim.deposit(3000);

        System.out.println(RED + "\n   _____                                            \n" +
                "  / ____|                                           \n" +
                " | (___  _   _ _ __ ___  _ __ ___   __ _ _ __ _   _ \n" +
                "  \\___ \\| | | | '_ ` _ \\| '_ ` _ \\ / _` | '__| | | |\n" +
                "  ____) | |_| | | | | | | | | | | | (_| | |  | |_| |\n" +
                " |_____/ \\__,_|_| |_| |_|_| |_| |_|\\__,_|_|   \\__, |\n" +
                "                                               __/ |\n" +
                "                                              |___/ ");
        System.out.println("\nMoutasim's Account Summary: \n" + moutasim.toString());

        Owner ceo = new Owner();
        ceo.setId(7865);
        ceo.setName("Khaled");
        ceo.setAddress("Abu Dhabi");

        Account khaled = new Account();
        khaled.setBalance(30000);
        khaled.setAnnualInterestRate(0.045);
        // TODO: "Display the object in 4"
        System.out.println("\nKhaled's Account Summary: \n" + khaled.toString());
    }
}