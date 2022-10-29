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
            System.out.println("""
                    1- Use existing robot
                    2- Create new robot
                    """);
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                System.out.println("Which robot you want to add the task to? ");
                showAllRobots(robots);
                System.out.print("Robot number: ");
                return scanner.nextInt();
            } else {
                return createRobot(robots, scanner);
            }
        }
    }

    public static void showAllRobots(ArrayList<Robot> robots) {
        for (int i = 0; i < robots.size(); i++) {
            System.out.println(i + "- " + robots.get(i));
        }
    }

    private static int createRobot(ArrayList<Robot> robots, Scanner scanner) {
        String robotName;
        System.out.print("Robot name: ");
        robotName = scanner.next();
        robots.add(new Robot(robotName));
        return robots.size() - 1;
    }

}
