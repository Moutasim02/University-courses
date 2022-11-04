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
            } else if (userChoice == 3) {
                raiseTaskPriority();
            } else if (userChoice == 4) {
                LowerTaskPriority();
            } else if (userChoice == 5) {
                displayTasks();
            } else if (userChoice == 6) {
                cancelTask();
            } else if (userChoice == 7) {
                returnLastCancelledTask();
            } else {
                System.out.println(Constants.ANSI_RED + "Thank you for using the Task Management System" + Constants.ANSI_RESET);
            }
        } while (userChoice != 0);
    }

    private static void displayMenu() {
        System.out.print(Constants.ANSI_GREEN + """
                \n--------------------------------------------------------------------
                                       Task Management System
                --------------------------------------------------------------------
                1- Create a Task
                2- Run Tasks
                3- Raise Priority of all tasks assigned to a specific slave robot
                4- Lower Priority of any task created before a given date
                5- Display Tasks
                6- Cancel a pending task
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
        System.out.print(Constants.ANSI_BLUE + "Enter the task expression: ");
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
        int robotIndex = AbstractRobot.chooseRobot();

        System.out.print("How many tasks to execute? ");
        int tasksToExecute = scanner.nextInt();

        PriorityQueue<Task> copyOfPriorityQueue = new PriorityQueue<>(robots.get(robotIndex).getTasksToHandleInPriority());
        Queue<Task> copyOfQueue = new LinkedList<>(robots.get(robotIndex).getTasksToHandleInQueue());

        for (int i = 0; i < tasksToExecute; i++) {
            if (!copyOfPriorityQueue.isEmpty() && copyOfPriorityQueue.element().getTaskStatus().equals("Pending")) {
                AbstractTask.taskResult(copyOfPriorityQueue.element());
                copyOfPriorityQueue.element().setTaskStatus("Executed");
                System.out.println(copyOfPriorityQueue.poll());
            } else if (!copyOfQueue.isEmpty() && copyOfQueue.element().getTaskStatus().equals("Pending")) {
                AbstractTask.taskResult(copyOfQueue.element());
                copyOfQueue.element().setTaskStatus("Executed");
                System.out.println(copyOfQueue.poll());
            }
        }
    }

    private static void raiseTaskPriority() {
        int robotIndex = AbstractRobot.chooseRobot();

        robots.get(robotIndex).getTasksToHandleInPriority().
                addAll(robots.get(robotIndex).getTasksToHandleInQueue());

        // Remove all from Queue
        for (int i = 0; i < robots.get(robotIndex).getTasksToHandleInQueue().size(); i++) {
            robots.get(robotIndex).getTasksToHandleInQueue().element().setTaskIsPrioritized(true);
            robots.get(robotIndex).getTasksToHandleInQueue().poll();
        }
        System.out.println(Constants.ANSI_RED + "All Priorities Raised for robot " + robots.get(robotIndex).getRobotName() + Constants.ANSI_RESET);
    }

    private static void LowerTaskPriority() {
        int robotIndex = AbstractRobot.chooseRobot();

        PriorityQueue<Task> copyOfPriorityQueue = new PriorityQueue<>(robots.get(robotIndex).getTasksToHandleInPriority());
        int priorityQSize = copyOfPriorityQueue.size();
        robots.get(robotIndex).getTasksToHandleInPriority().clear();

        System.out.println(Constants.ANSI_BLUE + "Please provide the creation second of the tasks that you want to lower their priority: " + Constants.ANSI_RESET);
        int seconds = scanner.nextInt();

        for (int i = 0; i < priorityQSize; i++) {
            if (copyOfPriorityQueue.element().getTaskCreationSecond() <= seconds) {
                copyOfPriorityQueue.element().setTaskIsPrioritized(false);
                robots.get(robotIndex).getTasksToHandleInQueue().add(copyOfPriorityQueue.poll());
            } else {
                robots.get(robotIndex).getTasksToHandleInPriority().add(copyOfPriorityQueue.poll());
            }
        }
    }

    private static void displayTasks() {
        AbstractTask.priorityDisplay();
        AbstractTask.queueDisplay();
    }

    private static void cancelTask() {
        int robotIndex = AbstractRobot.chooseRobot();

        System.out.println(Constants.ANSI_BLUE + "Which task expression do you want to cancel? " + Constants.ANSI_RESET);
        String taskExpression = scanner.next();

        Queue<Task> trackingQueue = new LinkedList<>(robots.get(robotIndex).getTasksToHandleInPriority());

        trackingQueue.addAll(robots.get(robotIndex).getTasksToHandleInQueue());

        robots.get(robotIndex).getTasksToHandleInPriority().clear();
        robots.get(robotIndex).getTasksToHandleInQueue().clear();

        while (!trackingQueue.isEmpty()) {
            if (trackingQueue.element().getTaskStatus().equals("Pending") && trackingQueue.element().getTaskExpression().equals(taskExpression)) {
                robots.get(robotIndex).getCancelledTasks().push(trackingQueue.poll());
            } else {
                if (trackingQueue.element().isTaskIsPrioritized())
                    robots.get(robotIndex).getTasksToHandleInPriority().add(trackingQueue.poll());
                else if (!trackingQueue.element().isTaskIsPrioritized())
                    robots.get(robotIndex).getTasksToHandleInQueue().add(trackingQueue.poll());
            }
        }

        System.out.println(Constants.ANSI_RED + "The cancelled task is: \n"
                + robots.get(robotIndex).getCancelledTasks() + Constants.ANSI_RESET);

        System.out.println(Constants.ANSI_RED + "Do you want to cancel any more tasks?");
        System.out.println("1- Yes");
        System.out.println("2- No" + "\n> " + Constants.ANSI_RESET);

        int userChoice = scanner.nextInt();
        if (userChoice == 1)
            cancelTask();
    }

    private static void returnLastCancelledTask() {
        int robotIndex = AbstractRobot.chooseRobot();
        if (robots.get(robotIndex).getCancelledTasks().isEmpty()) {
            System.out.println(Constants.ANSI_RED + "Cancel Task first" + Constants.ANSI_RESET);
            return;
        }
        if (robots.get(robotIndex).getCancelledTasks().peek().isTaskIsPrioritized())
            robots.get(robotIndex).getTasksToHandleInPriority().add(robots.get(robotIndex).getCancelledTasks().pop());
        else if (!robots.get(robotIndex).getCancelledTasks().peek().isTaskIsPrioritized())
            robots.get(robotIndex).getTasksToHandleInQueue().add(robots.get(robotIndex).getCancelledTasks().pop());
    }
}