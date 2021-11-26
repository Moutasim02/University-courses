package com.structured_programming_SWE201.Chapter6.Testing;
import java.util.Scanner;

public class BankingSystem {
    /*create arrays to store all accounts, passwords,informations,
    transactions, and balances that belong to users*/
    static String[] accounts = new String[5];
    static String[] passwords = new String[5];
    static double [] balance = new double[5];
    static int [] transactions = new int[5];
    static String[][] info = new String[5][6];
    //counter to count the users they sign up
    static int count = -1;

    public static void main(String[] args) {
        for(int b = 0; b < passwords.length; b++){
            passwords[b] = " ";
        }
        for(int a = 0; a < accounts.length; a++){
            accounts[a] = " ";
        }

        run();
    }
    //declaring and initializing global Variables
    static int c1 = 0;
    static int c2 = 0;
    static int onlineUser = 0;

    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n\tWELCOME TO OUR BANK\n");
        //prompt the user to choice either login or Sign Up
        System.out.print("1. login| 2. Sign Up: ");
        String account = "";
        String password = "";
        int option = 0;
        int ask = input.nextInt();

        if (ask == 1)
            //called login method
            logIn(account, password);
        else if (ask == 2)
            //called signup method
            signUp(account, password);
    }

    // method for login
    public static void logIn(String account, String password) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("\n\tLogin to Bank System\t\n");

        boolean k = true;
        while (k){
            boolean existedAccounts = false;
            boolean existedPassword = false;
            //Prompt the user to enter the account number
            System.out.print("Account Number: ");
            String logAccount = input.next();
            for(int i = 0; i < accounts.length; i++){
                //check if the logAccount equal to the account number which he signs up with
                if(logAccount.equals(accounts[i])){
                    existedAccounts = true;
                    c1 = i;
                    break;
                }
            }
            //Prompt the user to enter the password
            System.out.print("Password: ");
            String logPassword = input.next();
            for(int i = 0; i < passwords.length; i++){
                //check if the logPassword equal to the password which he signs up with
                if(logPassword.equals(passwords[i])){
                    existedPassword = true;
                    c2 = i;
                    break;
                }
            }
            //check if the account and password are existing and if they belong to each other
            if(existedAccounts == true && existedPassword == true && c1 == c2){
                System.out.println("login successfully");
                onlineUser = c1;
                //call the menu method
                menu(account, password);
                k = false;
            }
            //otherwise, it will show account and password are wrong
            else
                System.out.println("Your account number and password are wrong");
        }
    }

    // method for signUp
    public static void signUp(String account, String password) {
        Scanner input = new Scanner(System.in);
        //count will increase when new user sign up
        count++;
        boolean checks = true;

        while(checks){
            System.out.println("");
            System.out.println("\tSignUp\t");
            System.out.println("");

            System.out.print("Write your first name: ");
            String firstName = input.next();

            System.out.print("Write your second name: ");
            String secondName = input.next();

            System.out.print("Gender: (Male--> M or Female--> F): ");
            String gender = input.next().toUpperCase().substring(0, 1);

            System.out.print("Telephone number(+971 5xxxxxxxx): +971 5");
            String phoneNumber = input.next();

            //store input in information array
            info[count][0] = firstName;
            info[count][1] = secondName;
            info[count][2] = gender;
            info[count][3] = phoneNumber;

            //check if the inputs are correct
            if((info[count][2].equals("M") || info[count][2].equals("m")
                    || info[count][2].equals("F") || info[count][2].equals("f"))
                    && info[count][3].length() == 8){
                checks = false;
            }
            else{
                System.out.println("--------------------------");
                System.out.println("You have an error input with your info."
                        + "\nplease rewrite your info.");
                System.out.println("");
            }
        }
        //create account number
        String accoun = accountNumber();
        //create new password
        String pass = newPassword();
        //call login method
        logIn( account, password);
    }

    // method for accounts number
    public static String accountNumber()  {
        int accountExit = 0;
        int j = 0;
        String numAcc = "";
        int[] accountNumber = new int[6];

        do {
            //generate accounts numbers that contain six digits
            for (int i = 0; i < accountNumber.length; i++) {
                accountNumber[i] = (int) (Math.random() * 6) + 1;
                numAcc += accountNumber[i];
            }
            //check if the account is not duplicate
            for(int a = 0; a < accounts.length; a++){
                if(accounts[a].equals(numAcc))
                    accountExit++;
            }
            if (accountExit == 1)
                j++;
            else
                j = 0;
            accountExit = 0;
        } while (j > 0);
        System.out.println("--------------------------");
        System.out.println("your account is successfully created\n-->your account"
                + " number is (" + numAcc + ")");
        //store the accounts in the accounts array
        accounts[count] = numAcc;
        //the new users will start with zero balance in their accounts
        balance[count] = 0;
        return numAcc;
    }

    // method for passwords
    public static String newPassword() {
        Scanner input = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("create new password:\n" + "--> Your Password should be 8 characters: "
                + "\n- At least One capital letter\n- At least One small letter"
                + "\n- One special character(! @ # ? ])");

        String password;
        int passwordExit = 0;
        int capitalLetter = 0;
        int smallLetter = 0;
        int specialCharacter = 0;
        int j = 0;

        do {
            //promt the user to enter new password
            System.out.print("New password: ");
            password = input.next();
            int lenPassword = password.length();
            //check if the password is existed or not
            for(int a = 0; a < passwords.length; a++){
                if(passwords[a].equals(password)){
                    System.out.println("This password is already exist");
                    passwordExit++;
                    j++;
                    System.out.println("");
                }
            }
            //check the length of the password
            if (lenPassword != 8) {
                j++;
                System.out.println("--> Your Password should be 8 characters:"
                        + "\n- At least One capital letter\n- At least One small letter"
                        + "\n- At least One special character(! @ # ? ])");
            }
            else if (lenPassword == 8 && passwordExit == 0){
                //check if the user include all the requirement to create the new password
                for (int i = 0; i < lenPassword; i++) {
                    char ch = password.charAt(i);
                    if (Character.isUpperCase(ch))
                        capitalLetter++;
                    if (Character.isLowerCase(ch))
                        smallLetter++;
                    if (ch == '!' || ch == '@' || ch == '#' || ch == '?' || ch == ']')
                        specialCharacter++;
                }
                if (capitalLetter >= 1 && smallLetter >= 1 && specialCharacter >= 1) {
                    System.out.println("Valid Password");
                    //store the password in the passwords array
                    passwords[count] = password;
                    j = 0;
                }
                //otherwise, the user must rewrite the new password
                else {
                    capitalLetter = 0;
                    smallLetter = 0;
                    specialCharacter = 0;
                    System.out.println("--> Your Password should be 8 characters:"
                            + "\n- At least One capital letter\n- At least One small letter"
                            + "\n- At least One special character(! @ # ? ])");
                    System.out.println("--------------------------");
                    j++;
                }
            }
            passwordExit = 0;
        }while (j > 0);

        return password;
    }

    // method for menu
    public static void menu(String account, String password) {
        Scanner input = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("");
        System.out.println("\tMENU\t");

        while (true) {
            //prompt the user to choose which option he wants
            System.out.println("----------------------");
            System.out.println("0- View profile\n1- View balance\n2- Deposit money\n"
                    + "3- Withdraw money\n4- Transfer money\n"
                    + "5- Loan apply\n6- Delete account\n7- Log out");
            System.out.print("Select: ");
            int option = input.nextInt();
            System.out.println("----------------------");

            switch(option){
                case 0://view profile
                    System.out.println("First name: " + info[onlineUser][0]);
                    System.out.println("Second name: " + info[onlineUser][1]);
                    System.out.println("Gender: " + info[onlineUser][2]);
                    System.out.println("Phone number: +971 5" + info[onlineUser][3]);
                    System.out.println("Account number: " + accounts[c1]);
                    break;
                case 1://View balance
                    System.out.println("\tView balance\t");
                    System.out.println("Your balance: " + balance[c1] + "$");
                    break;
                case 2://Deposit money
                    depositMoney(account, password);
                    break;
                case 3://Withdraw money
                    WithdrawMoney(account, password);
                    break;
                case 4://transfer money
                    transferMoney(account, password);
                    break;
                case 5://loan apply
                    //call loan apply method
                    loanApply(account, password);
                    break;
                case 6:// deleted Account
                    //call delete Account method
                    deleteAccounts(account, password, option);
                    break;
                case 7://logout
                    //call log out method
                    logOut();
            }
        }
    }

    // method for loan Apply
    public static void loanApply(String account, String password){
        Scanner input = new Scanner(System.in);
        System.out.println("\t\tApply to loan\t\t");
        System.out.println("");
        /*prompt the user to enter the amount of money
        and enter how long that the user needs to pay off the loan*/
        System.out.println("\t---> Rules to apply to loan in OUR Bank <---\t");
        System.out.println("- The user must have at least has 3 transactions in OUR bank.\n"
                + "- The minimum balance should be in your account 50% of the loan amount.\n"
                + "- The installment depends on the user's account. it must start from 20% of the user balance.");
        System.out.println("");
        System.out.print("Enter the amount of money that do you want to apply: ");
        int loan = input.nextInt();
        System.out.print("How long do you need to pay off the loan? ");
        int payOff = input.nextInt();

        if(loan < 0 || payOff < 0)
            System.out.println("You have an error input.");
        else if(loan > 0 && payOff > 0){
            //The installment must start from 20% of the user balance
            double installments = 0.2 * balance[c1];
            int month = 0;
            int amount = loan;
            //Test if the user has 50% of the loan amount
            double minimumBalance = 0.5 * loan;
            /*check if the user balance greater than the minimum amount of balance
            and at least has 3 transactions*/
            if(minimumBalance < balance[c1] && transactions[c1] >= 3){
                while (true) {
                    //calculate the minimum months that the user should pay off the loan
                    if(amount > installments){
                        amount -= installments;
                        month++;
                    }
                    else{
                        month++;
                        break;
                    }
                }
                //check if the user needs to pay off greater than or equal minimum months
                if(payOff < month)
                    System.out.println("You can't pay off the loan in " +  payOff +
                            " months you must pay off the loan in " + month + " months or more\nThank you!");
                    //approved loan
                else{
                    System.out.print("The loan is approved according to Bank rules.\n\n"
                            + "You must pay off the loan in " + payOff + " months and for any Payment"
                            + " delay you have to pay 1000 dollars per month delay.\n\n"
                            + "If you are agree write AGREE otherwise write DISAGREE: ");
                    String ifAgree = input.next().toUpperCase();

                    if(ifAgree.equals("AGREE")){
                        System.out.print("sign here please\n\t|\n\t|\n\tV\n\t");
                        String signHere = input.next();
                        balance[c1] += loan;
                        System.out.println("Thank you for applying with us.\n\n"
                                + "your money will be added automatically to your account.");
                        menu(account, password);
                    }
                    else{
                        System.out.println("Thank you");
                        menu(account, password);
                    }
                }
            }
            else
                System.out.println("the loan is not approved since your account "
                        + "does not match Bank rules.\nThank you!");
        }
    }

    // method for Withdraw Money
    public static void WithdrawMoney(String account, String password){
        Scanner input = new Scanner(System.in);
        System.out.println("\tWithdraw money\t");
        //prompt the user to enter the amount of money
        System.out.print("Enter the money : ");
        double withdrawMoney = input.nextDouble();

        if(withdrawMoney < 0)
            System.out.println("You have an error input.");
        else if(withdrawMoney > 0){
            //check if the user has this money
            if (withdrawMoney > balance[c1])
                System.out.println("Your balance is " + balance[c1]
                        + "$ you can't withdraw " + withdrawMoney + "$");
            else{
                balance[c1] -= withdrawMoney;
                System.out.println("Withdraw successfully\nyour balance : "
                        + balance[c1] + "$");
                transactions[c1]++;
            }
        }
    }

    // method for transfer Money
    public static void transferMoney(String account, String password){
        Scanner input = new Scanner(System.in);
        int exist = 0;
        System.out.println("\ttransfer money\t");
        //prompt the user to enter the amount of money
        System.out.print("Enter the amount of money that you want to send: ");
        double transferMoney = input.nextDouble();
        //prompt the user to enter the account number
        System.out.print(
                "Enter the account number for who do you want to send:"
                        + "(Account number contain 6-Digit) ");
        String toAccNumber = input.next();

        if(transferMoney < 0)
            System.out.println("You have an error input.");
        else if(transferMoney > 0){
            if(toAccNumber.length() == 6){
                //check if the has this money
                if (transferMoney > balance[c1]){
                    System.out.println("Your balance is " + balance[c1]
                            + "$ you can't transfer " + transferMoney + "$");
                    menu(account,password);
                }
                for(int j = 0; j < 5; j++){
                    //check if this account is exist
                    if(toAccNumber.equals(accounts[j])){
                        balance[j] += transferMoney;
                        balance[c1] -= transferMoney;
                        System.out.println("Transfer successfully\nyour balance : "
                                + balance[c1] + "$");
                        transactions[c1]++;
                        exist++;
                        break;
                    }
                }
                //if the account does not exist stop the Process
                if(exist == 0)
                    System.out.println("This Account [" + toAccNumber + "] is not exist");
                exist = 0;
            }
            else
                System.out.println("ERROR!\nAccount number contains 6 digits"
                        + "\nPlease try again");
        }
    }

    // method for Deposit Money
    public static void depositMoney(String account, String password){
        Scanner input = new Scanner(System.in);
        System.out.println("\tDeposit money\t");
        //prompt the user to insert the amount of money
        System.out.print("Insert the money\n\t|\n\t|\n\tV\n\t");
        double depositMoney = input.nextDouble();

        if(depositMoney < 0)
            System.out.println("You have an error input.");
        else if(depositMoney > 0){
            balance[c1] += depositMoney;
            System.out.println("Deposit successfully\nyour balance : "
                    + balance[c1] + "$");
            transactions[c1]++;
        }
    }

    // method for delete Account
    public static void deleteAccounts(String account, String password, int option) {
        Scanner input = new Scanner(System.in);
        //a confirmation message to check if the user wants to delete the account
        System.out.print("Are you sure that you want to delete the account (Y or N) : ");
        char choice = input.next().toUpperCase().charAt(0);
        //if he confirms, delete the account
        if ( choice == 'Y'){
            accounts[c1] = "";
            passwords[c1] = "";
            transactions[c1] = 0;
            balance[c1] = 0;
            for(int i = 0; i < info.length; i++)
                info[c1][i] = "";
            System.out.println("your account successfully deleted!");
            run();
        }
        //otherwise, get back to the menu
        else if(choice == 'N')
            menu(account, password);
        else
            System.out.println("You have an error input.");
    }

    // method for logOut
    public static void logOut() {
        System.out.println("logout successfully");
        System.out.println("==========================");
        System.out.println("");
        run();
    }
}

// Sign in/up condition to repeat if wrong number inputted
// User should be able to go back to main menu from sign in/up state
// For future edition, you can make the user use username or email to login rather than some random numbers you can't remember
// Clicking view balance at beginning make us stuck (Maybe in loop or something...), No resources consumed AFAIK
// TYPO: when account doesn't exist error says "is not" rather than "does not"
// Going back option should be implemented in every menu I believe because if u want to go back you just stop and redo the whole thing again

