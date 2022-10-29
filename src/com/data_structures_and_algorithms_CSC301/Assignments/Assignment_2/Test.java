package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_2;

import java.util.*;

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
//            } else if (userChoice == 3) {
//                raiseTaskPriority();
//            } else if (userChoice == 4) {
//                LowerTaskPriority();
//            } else if (userChoice == 5) {
//                displayTasks();
//            } else if (userChoice == 6) {
//                cancelTask();
//            } else if (userChoice == 7) {
//                returnLastCancelledTask();
            } else {
                System.out.println("Thank you for using the Task Management System");
            }
        } while (userChoice != 0);
    }

    private static void displayMenu() {
        System.out.print("""
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
        // Ask which robot, if not available ask for creating new one
        int robotIndex = Robot.robotCreationProcess(robots);

        // Get details
        System.out.print("Enter Task Name: ");
        String taskName = scanner.next();
        boolean isPrioritized = AbstractTask.checkIfPrioritized();

        // Create the task
        if (isPrioritized)
            robots.get(robotIndex).getTasksToHandleInPriority().add(new Task(taskName, new Date().getMinutes(), true));
        else
            robots.get(robotIndex).getTasksToHandleInQueue().add(new Task(taskName, new Date().getMinutes(), false));

        System.out.println("Task created");
    }

    private static void runTasks() {
        System.out.println("Which robot to execute its tasks? ");
        AbstractRobot.showAllRobots(robots);

        System.out.print("Robot number: ");
        int robotIndex = scanner.nextInt();

        System.out.print("How many tasks to execute? ");
        int tasksToExecute = scanner.nextInt();

        PriorityQueue<Task> copyOfPriorityQueue = new PriorityQueue<>(robots.get(robotIndex).getTasksToHandleInPriority());
        Queue<Task> copyOfQueue = new LinkedList<>(robots.get(robotIndex).getTasksToHandleInQueue());

        for (int i = 0; i < tasksToExecute; i++) {
            if (!copyOfPriorityQueue.isEmpty()) {
                AbstractTask.taskResult(copyOfPriorityQueue.element());
                System.out.println(copyOfPriorityQueue.poll());
            } else if (!copyOfQueue.isEmpty()) {
                AbstractTask.taskResult(copyOfQueue.element());
                System.out.println(copyOfPriorityQueue.poll());
            }
        }
    }
//
//    private static void raiseTaskPriority() {
//        System.out.println("Which robot to higher its tasks priority? ");
//        AbstractRobot.showAllRobots(robots);
//
//        System.out.print("Robot number: ");
//        int robotIndex = scanner.nextInt();
//        robots.get(robotIndex).getTasksToHandleInPriority().
//                addAll(robots.get(robotIndex).getTasksToHandleInQueue());
//
//        // Remove all from Queue
//        for (int i = 0; i < robots.get(robotIndex).getTasksToHandleInQueue().size(); i++) {
//            robots.get(robotIndex).getTasksToHandleInQueue().poll();
//        }
//        System.out.println("Priorities Raised for robot " + robots.get(robotIndex).getRobotName());
//    }
//
//    private static void LowerTaskPriority() {
//        System.out.println("Please provide the creation minute of the tasks you want to lower their priority:  ");
//        int highestMinute = scanner.nextInt();
//
//        for (int i = 0; i < robots.size(); i++) {
//            if (robots.get(i).getTasksToHandleInPriority().peek().getTaskCreationMinutes() <= highestMinute) {
//
//            }
//        }
//    }
//
//    private static void displayTasks() {
//        AbstractTask.priorityDisplay();
//        AbstractTask.queueDisplay();
//    }
//
//    private static void cancelTask() {
//
//    }
//
//    private static void returnLastCancelledTask() {
//    }
}
