package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_2;

import java.util.*;

import static java.lang.String.valueOf;

public abstract class AbstractTask implements Comparable<Task> {
    protected int taskResult;

    public AbstractTask() {

    }
// Priorities are not being added to the PriorityQueue in ascending/ descending order.
    protected static boolean checkIfPrioritized() {
        System.out.print("""
                Should we prioritize the task?
                1- Yes
                2- No
                >
                """);
        int choice = Test.scanner.nextInt();
        while (choice < 1 || choice > 2) {
            choice = Test.scanner.nextInt();
        }
        return choice == 1;
    }


    protected static void taskResult(Task taskName) {
        int result = 0;
        String str = "";
        char[] chars = taskName.getTaskName().toCharArray();
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

        result = getResult(result, toStoreInteger, toStoreOperands);
        taskName.setTaskResult(result);
        taskName.setTaskStatus("Executed");
    }

    private static int getResult(int result, Stack<String> toStoreInteger, Stack<String> toStoreOperands) {
        for (int i = 0; i < toStoreInteger.size(); i++) {
            for (int j = 0; j < toStoreOperands.size(); j++) {
                int firstNumber = Integer.parseInt(toStoreInteger.pop());
                String operand = toStoreOperands.pop();
                int secondNumber = Integer.parseInt(toStoreInteger.pop());
                char c = operand.charAt(0);

                result = operatorFxn(result, firstNumber, secondNumber, c);
            }
        }
        return result;
    }

    private static int operatorFxn(int result, int firstNumber, int secondNumber, char c) {
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
        return result;
    }

    protected static void queueDisplay() {
        for (int i = 0; i < Test.robots.size(); i++) {
            Queue<Task> taskQueue = new LinkedList<>(Test.robots.get(i).getTasksToHandleInQueue());
            if (taskQueue.peek() != null) {
                if (taskQueue.peek().getTaskStatus().equals("Pending")) {
                    System.out.println("Task result: " + taskQueue.poll());
                } else {
                    taskQueue.poll();
                }
            }
        }
    }

    protected static void priorityDisplay() {
        for (int i = 0; i < Test.robots.size(); i++) {
            PriorityQueue<Task> taskPriorityQueue = new PriorityQueue<>(Test.robots.get(i).getTasksToHandleInPriority());
            if (taskPriorityQueue.peek() != null) {
                if (taskPriorityQueue.peek().getTaskStatus().equals("Executed")) {
                    System.out.println("Task result: " + taskPriorityQueue.poll());
                } else {
                    taskPriorityQueue.poll();
                }
            }
        }
    }

    public int getTaskResult() {
        return taskResult;
    }

    public void setTaskResult(int taskResult) {
        this.taskResult = taskResult;
    }

    @Override
    public int compareTo(Task task) {
        if (taskResult == task.taskResult)
            return 0;
        else if (taskResult > task.taskResult)
            return 1;
        else
            return -1;
    }

}
