package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_2;

import java.util.Date;

public class Task extends AbstractTask implements Comparable<Task> {
    private String taskExpression;
    private long taskCreationSecond;
    private boolean taskIsPrioritized;
    private String taskStatus;


    public Task(String taskExpression, boolean taskIsPrioritized) {
        this.taskExpression = taskExpression;
        this.taskCreationSecond = new Date().getSeconds();
        this.taskIsPrioritized = taskIsPrioritized;
        this.taskStatus = "Pending";
    }


    @Override
    public String toString() {
        return Constants.ANSI_YELLOW + "\nTask expression is: " + taskExpression +
                "\nTask creation in seconds: " + taskCreationSecond +
                "\nIs the task prioritized? " + taskIsPrioritized +
                "\nTask status is: " + taskStatus + "\n";
    }

    public String getTaskExpression() {
        return taskExpression;
    }

    public void setTaskExpression(String taskExpression) {
        this.taskExpression = taskExpression;
    }

    public long getTaskCreationSecond() {
        return taskCreationSecond;
    }

    public void setTaskCreationSecond(long taskCreationSecond) {
        this.taskCreationSecond = taskCreationSecond;
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
