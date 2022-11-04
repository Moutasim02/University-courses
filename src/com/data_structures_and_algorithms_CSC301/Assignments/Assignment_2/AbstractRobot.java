package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_2;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class AbstractRobot {

    public static int robotCreationProcess(ArrayList<Robot> robots) { // returns the index of the robot
        Scanner scanner = new Scanner(System.in);

        if (robots.isEmpty()) {
            System.out.println("Please create robot first!");
            return createRobot(robots, scanner);
        } else {
            System.out.println(Constants.ANSI_RED + "1- Use an existing robot");
            System.out.print("2- Create a new robot" + "\n> " + Constants.ANSI_RESET);

            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                System.out.println("Which robot you want to add the task to? ");
                showAllRobots(robots);
                System.out.print(Constants.ANSI_BLUE + "Robot number: " + Constants.ANSI_RESET);
                return scanner.nextInt();
            } else {
                return createRobot(robots, scanner);
            }
        }
    }

    public static void showAllRobots(ArrayList<Robot> robots) {
        for (int i = 0; i < robots.size(); i++) {
            System.out.println(Constants.ANSI_CYAN + i + "- " + robots.get(i));
        }
    }

    private static int createRobot(ArrayList<Robot> robots, Scanner scanner) {
        String robotName;
        System.out.print(Constants.ANSI_BLUE + "Robot name: ");
        robotName = scanner.next();
        robots.add(new Robot(robotName));
        return robots.size() - 1;
    }

    static int chooseRobot() {
        System.out.println(Constants.ANSI_RED + "Choose a robot: ");
        showAllRobots(Test.robots);

        System.out.print(Constants.ANSI_BLUE + "Robot number: " + Constants.ANSI_RESET);
        return Test.scanner.nextInt();
    }
}
