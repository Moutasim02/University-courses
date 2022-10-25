package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Robot {
    private String robotName;
    private Queue<Task> tasksToHandleInQueue = new LinkedList<>(); //FIFO
    private PriorityQueue<Task> tasksToHandleInPriority = new PriorityQueue<>();

    public Robot(String robotName) {
        this.robotName = robotName;
    }

    public Robot() {
    }

    @Override
    public String toString() {
        return "Robot{" +
                "robotName='" + robotName + '\'' +
                ", tasksToHandleInQueue=" + tasksToHandleInQueue +
                ", tasksToHandleInPriority=" + tasksToHandleInPriority +
                '}';
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
