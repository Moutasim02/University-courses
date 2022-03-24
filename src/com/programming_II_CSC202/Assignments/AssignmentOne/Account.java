package com.programming_II_CSC202.Assignments.AssignmentOne;

import java.util.Date;

public class Account {
    private int balance = 0;
    private double annualInterestRate;
    private Date dateCreated;

    private static final String RED = "\u001b[31m";
    private static final String GREEN = "\u001b[32m";
    private static final String BLUE = "\u001b[34m";

    public Account() {
        // Default constructor to make the class mutable
    }

    public Account(int balance, double annualInterestRate, Date dateCreated) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;
    }

    // Transfer from one account to another
    public void toAccount(Account accountOfSender, Account accountOfReceiver, double amountToTransfer) {
        System.out.println(BLUE + "Sender's account balance before withdrawal: " + accountOfSender.getBalance());
        accountOfSender.withdraw(2500);
        System.out.println("");
        System.out.println("Receiver's account balance before withdrawal: " + accountOfSender.getBalance());
        accountOfReceiver.deposit(2500);
    }

    // Monthly Interest Rate
    public double getMonthlyInterestRate(int monthlyInterestRate) {
        return annualInterestRate / 12;
    }

    // Monthly Interest Amount
    public double getMonthlyInterest() {
        double monthlyInterest = ((balance * annualInterestRate / 1200) / 100) * 100.0;
        return monthlyInterest;
    }

    //The following logic apply if we are getting input from user as I assumed at first... Anyway it works
    public void withdraw(int amountToWithdraw) {
        if (amountToWithdraw > balance) {
            System.out.println(RED + "Can't withdraw as you don't have sufficient funds");
        } else {
            System.out.println("Your updated balance after successful withdrawal is: " + (balance -= amountToWithdraw) + GREEN);
        }
    }

    public void deposit(int amountToDeposit) {
        System.out.println(GREEN + "Your updated balance after successful deposit is: " + (balance += amountToDeposit));
    }

    @Override
    public String toString() {
        return "Balance: " + balance
                + "\nMonthly interest: " + getMonthlyInterest()
                + "\nAccount Created In: " + dateCreated;
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
