package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Robot extends AbstractRobot {
    private String robotName;
    private Queue<Task> tasksToHandleInQueue = new LinkedList<>(); //FIFO
    private PriorityQueue<Task> tasksToHandleInPriority = new PriorityQueue<>(); // Higher results first
    private Stack<Task> cancelledTasks = new Stack<>();

    public Robot(String robotName) {
        this.robotName = robotName;
    }

    @Override
    public String toString() {
        return Constants.ANSI_CYAN + "Robot name is: " + robotName +
                "\nTasks to handle in queue are:\n" + tasksToHandleInQueue +
                "\nTasks to handle in priority queue are:\n" + tasksToHandleInPriority + Constants.ANSI_RESET;
    }

    public Stack<Task> getCancelledTasks() {
        return cancelledTasks;
    }

    public void setCancelledTasks(Stack<Task> cancelledTasks) {
        this.cancelledTasks = cancelledTasks;
    }

    public String getRobotName() {
        return robotName;
    }

    public void setRobotName(String robotName) {
        this.robotName = robotName;
    }

    public Queue<Task> getTasksToHandleInQueue() {
        return tasksToHandleInQueue;
    }

    public void setTasksToHandleInQueue(Queue<Task> tasksToHandleInQueue) {
        this.tasksToHandleInQueue = tasksToHandleInQueue;
    }

    public PriorityQueue<Task> getTasksToHandleInPriority() {
        return tasksToHandleInPriority;
    }

    public void setTasksToHandleInPriority(PriorityQueue<Task> tasksToHandleInPriority) {
        this.tasksToHandleInPriority = tasksToHandleInPriority;
    }

}
