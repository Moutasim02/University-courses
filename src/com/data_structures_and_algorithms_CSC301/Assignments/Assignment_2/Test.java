package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import static java.lang.String.valueOf;

public class Test {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Robot> robots = new ArrayList<>();

    public static void main(String[] args) {

        int userChoice;
        do {
            displayMenu();
            userChoice = UserMenuChoice(scanner);
            if (userChoice == 1) {
                createTask();
            } else if (userChoice == 2) {
                runTasks();
            } else if (userChoice == 3) {
                raiseTaskPriority();
            } else if (userChoice == 4) {
                LowerTaskPriority();
            } else if (userChoice == 5) {
                displayTasks();
            } else if (userChoice == 6) {
                cancelTask();

                returnLastCancelledTask();

                System.out.println("Thank you for using the Task Management System");
            } else if (userChoice == 7) {
                returnLastCancelledTask();

                System.out.println("Thank you for using the Task Management System");
            } else {
                System.out.println("Thank you for using the Task Management System");
            }
        } while (userChoice != 0);
    }

    private static void displayMenu() {
        System.out.println("""
                \n--------------------------------------------------------------------
                                       Task Management System
                --------------------------------------------------------------------
                1- Create a Task
                2- Run Tasks
                3- Raise Priority of all tasks assigned to a specific slave robot
                4- Lower Priority of any task created before a given date
                5- Display Tasks
                6- Cancel a pending task (multi-callable)
                7- Return last cancelled task
                0- Quit
                --------------------------------------------------------------------
                """);
    }

    private static int UserMenuChoice(Scanner input) {
        int choice;
        do {
            System.out.print("Your choice (0, 1, 2, 3, 4, 5, 6, 7):");
            choice = input.nextInt();
        } while (choice > 7);
        return choice;
    }

    private static void createTask() {
        // ask which robot, if not available ask for creating new one
        int robotIndex = robotProcess();

        System.out.print("Enter Task Name: ");
        String taskName = scanner.next();
        System.out.print("Enter Creation Date:");
        String taskCreationDate = scanner.next();
        boolean isPrioritized = checkIfPrioritized();
        String taskStatus = taskStatus();
        int taskResult = taskResult(taskName);

        if (isPrioritized)
            robots.get(robotIndex).getTasksToHandleInPriority().add(new Task(taskName, taskCreationDate, true, taskStatus, 5));
        else
            robots.get(robotIndex).getTasksToHandleInQueue().add(new Task(taskName, taskCreationDate, false, taskStatus, 23));

        System.out.println("Task created");
    }

    private static void runTasks() {
        Robot robot = new Robot();
        System.out.print("How many tasks to execute? ");
        int tasksToExecute = scanner.nextInt();
        for (int i = 0; tasksToExecute <= robot.getTasksToHandleInPriority().size(); i++, tasksToExecute--) {

        }
    }

    private static int taskResult(String taskName) {
        int result = 0;
        String str = "";
        char[] chars = taskName.toCharArray();
        ArrayList<Character> characterArrayList = new ArrayList<>();
        for (char aChar : chars) {
            characterArrayList.add(aChar);
        }
        characterArrayList.add((char) 32);
        Stack<String> toStoreInteger = new Stack<>();
        Stack<String> toStoreOperands = new Stack<>();
        char num = 32;

        // Add the character to the suitable stack
        for (int i = 0; i < characterArrayList.size(); i++) {
            if (Character.isDigit(characterArrayList.get(i))) {
                str = str.concat(valueOf(characterArrayList.get(i)));
            } else {
                toStoreInteger.push(str);
                if (!valueOf(characterArrayList.get(i)).equals(valueOf(num))) {
                    toStoreOperands.push(valueOf(characterArrayList.get(i)));
                }
                str = "";
            }
        }
        System.out.println(toStoreOperands);
        System.out.println(toStoreInteger);

        // [+, +, *]
        // [100, 20, 50, 10]
        // Find result
        for (int i = 0; i < toStoreInteger.size(); i++) {
            for (int j = 0; j < toStoreOperands.size(); j++) {
                int firstNumber = Integer.parseInt(toStoreInteger.pop());
                String operand = toStoreOperands.pop();
                int secondNumber = Integer.parseInt(toStoreInteger.pop());
                char c = operand.charAt(0);

                if (c == 45) { // -
                    result = result - (firstNumber - secondNumber);
                } else if (c == 47) { // /
                    result = result + firstNumber / secondNumber;
                } else if (c == 43) { // +
                    result = result + firstNumber + secondNumber;
                } else if (c == 42 && result != 0) { // *
                    result = result * firstNumber * secondNumber;
                } else {
                    result = firstNumber * secondNumber;
                }
            }
        }
        return result;
    }

    // tasks <= in prior
    // task > prior.size -> execute until reaching prior.size == 0
    private static void raiseTaskPriority() {
    }

    private static void LowerTaskPriority() {
    }

    private static void displayTasks() {
    }

    private static void returnLastCancelledTask() {
    }

    private static void cancelTask() {
    }


    // For Creating the task (1)
    private static int robotProcess() { // returns the index of the robot
        String robotName;
        if (robots.isEmpty()) {
            System.out.println("Please create robot first!");
            System.out.print("Robot name: ");
            robotName = scanner.next();
            robots.add(new Robot(robotName));
            return robots.size() - 1;
        } else {
            System.out.println("Which robot you want to add the task to? ");
            for (int i = 0; i < robots.size(); i++) {
                System.out.println(i + " " + robots.get(i));
            }
            System.out.print("Robot number: ");
            return scanner.nextInt();
        }
    }

    private static boolean checkIfPrioritized() {
        System.out.print("""
                Should we prioritize the task?
                1- Yes
                2- No
                >
                """);
        int choice;
        do {
            choice = scanner.nextInt();
            if (choice == 1) {
                return true;
            }
        } while (choice == 1 || choice == 2);
        return false;
    }

    private static String taskStatus() {
        System.out.print("""
                What is the task status?
                1- Pending
                2- Executed
                >
                """);
        int choice;
        do {
            choice = scanner.nextInt();
            if (choice == 1) {
                return "Pending";
            } else {
                return "Executed";
            }
        } while (choice == 1 || choice == 2);
    }
}
