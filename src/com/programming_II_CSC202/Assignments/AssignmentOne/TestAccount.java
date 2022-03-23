package com.programming_II_CSC202.Assignments.AssignmentOne;

import java.util.Date;

public class TestAccount {
    private static final String RED = "\u001b[31m";
    private static final String BLUE = "\u001b[34m";

    public static void main(String[] args) {

        Owner owner = new Owner(1122,"Moutasim El Ayoubi","MBZ City");
        Account moutasim = new Account(20000, 0.045, new Date());

        System.out.println(BLUE + "\nDear " + owner.getName() + " with the ID: " + owner.getId());
        moutasim.withdraw(2500);

        System.out.println("\nDear " + owner.getName() + " with the ID: " + owner.getId());
        moutasim.deposit(3000);

        Owner ceo = new Owner(7865, "Khaled", "Abu Dhabi");
        Account khaled = new Account(30000,0.045, new Date());

        System.out.println(BLUE + "\nDear " + ceo.getName() + " with the ID: " + ceo.getId());
        khaled.withdraw(2500);

        System.out.println("\nDear " + ceo.getName() + " with the ID: " + ceo.getId());
        khaled.deposit(3000);

        System.out.println(RED + "\n-------------------------------------------\nAfter account transfer from " + ceo.getId()
                + " to " + owner.getId() + ":\n" + "-------------------------------------------");
        moutasim.toAccount(khaled, moutasim, 2500);

        System.out.println(RED + "\n   _____                         \n" +
                "  / ____|                                           \n" +
                " | (___  _   _ _ __ ___  _ __ ___   __ _ _ __ _   _ \n" +
                "  \\___ \\| | | | '_ ` _ \\| '_ ` _ \\ / _` | '__| | | |\n" +
                "  ____) | |_| | | | | | | | | | | | (_| | |  | |_| |\n" +
                " |_____/ \\__,_|_| |_| |_|_| |_| |_|\\__,_|_|   \\__, |\n" +
                "                                               __/ |\n" +
                "                                              |___/ ");
        System.out.println("\nMoutasim's Account Summary: \n" + moutasim.toString());
        System.out.println("\nKhaled's Account Summary: \n" + khaled.toString());
    }
}