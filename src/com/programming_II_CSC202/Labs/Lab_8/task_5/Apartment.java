package com.programming_II_CSC202.Labs.Lab_8.task_5;

public class Apartment extends House{
    public String toString() {
        return forSale() + "" + " The apartment in mbz";
    }

    @Override
    public String forSale() {
        return "1 Bedroom Apartment";
    }

    @Override
    public void location() {
        System.out.println("The apartment in mbz");
    }
}
