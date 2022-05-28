package com.programming_II_CSC202.Labs.Lab_8.task_5;

public class Villa extends House {
    public String toString() {
        return forSale() + "" + " The villa in corniche";
    }

    @Override
    public String forSale() {
        return "5 Bedroom villa";
    }

    @Override
    public void location() {
        System.out.println("The villa in corniche");
    }
}
