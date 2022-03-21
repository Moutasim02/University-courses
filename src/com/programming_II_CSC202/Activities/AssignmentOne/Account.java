package com.programming_II_CSC202.Activities.AssignmentOne;

import java.util.Date;

public class Account {
    private int balance = 0;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    private static final String RED = "\u001b[31m";
    private static final String GREEN = "\u001b[32m";

    public Account() {
        // Default constructor to make the class mutable
    }

    public Account(int balance, double annualInterestRate, Date dateCreated) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;
    }

    // Monthly Interest Rate TODO: Not used by the program
    public double getMonthlyInterestRate(int monthlyInterestRate) {
        return annualInterestRate / 12;
    }

    // Monthly Interest Amount
    public double getMonthlyInterest() {
        double monthlyInterest = balance * (annualInterestRate / 1200);
        return monthlyInterest;
    }

    //The following logic apply if we are getting input from user as I assumed at first... Anyway it works
    public void withdraw(int amountToWithdraw) {
        if (amountToWithdraw > balance) {
            System.out.println(RED + "Can't withdraw as you don't have sufficient funds");
        } else {
            System.out.println("Your updated balance after successful withdrawal is: " + (balance += amountToWithdraw) + GREEN);
        }
    }

    public void deposit(int amountToDeposit) {
        System.out.println(GREEN + "Your updated balance after successful deposit is: " + (balance += amountToDeposit));
    }

    @Override
    public String toString() {
        return "Balance: " + balance
                + "\nMonthly interest: " + getMonthlyInterest()
                + "\nAccount Created In: " + dateCreated.toString();
    }

    // Getters and Setters
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }


}
