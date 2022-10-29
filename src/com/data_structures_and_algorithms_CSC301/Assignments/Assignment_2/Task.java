package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_2;

import java.util.Date;

public class Task extends AbstractTask {
    private String taskName;
    private int taskCreationMinutes;
    private boolean taskIsPrioritized;
    private String taskStatus;


    public Task(String taskName, int taskCreationMinutes, boolean taskIsPrioritized) {
        this.taskName = taskName;
        this.taskCreationMinutes = taskCreationMinutes;
        this.taskIsPrioritized = taskIsPrioritized;
        this.taskStatus = "Pending";
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName is:" + taskName + '\'' +
                "taskCreationHour is:" + taskCreationMinutes +
                "taskIsPrioritized:" + taskIsPrioritized +
                "taskStatus is:" + taskStatus + '\'' +
                "taskResult is:" + taskResult +
                '}';
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskCreationMinutes() {
        return taskCreationMinutes;
    }

    public void setTaskCreationMinutes(int taskCreationMinutes) {
        this.taskCreationMinutes = taskCreationMinutes;
    }

    public boolean isTaskIsPrioritized() {
        return taskIsPrioritized;
    }

    public void setTaskIsPrioritized(boolean taskIsPrioritized) {
        this.taskIsPrioritized = taskIsPrioritized;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

}
