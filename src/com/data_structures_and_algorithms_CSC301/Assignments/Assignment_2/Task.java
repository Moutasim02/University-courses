package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_2;

public class Task implements Comparable<Task>{
    private String taskText;
    private String taskCreationDate;
    private boolean taskIsPrioritized;
    private String taskStatus;
    private int taskResult;

    public Task(String taskText, String taskCreationDate, boolean taskIsPrioritized, String taskStatus, int taskResult) {
        this.taskText = taskText;
        this.taskCreationDate = taskCreationDate;
        this.taskIsPrioritized = taskIsPrioritized;
        this.taskStatus = taskStatus;
        this.taskResult = taskResult;
    }

    public int getTaskResult() {
        return taskResult;
    }

    public void setTaskResult(int taskResult) {
        this.taskResult = taskResult;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskText='" + taskText + '\'' +
                ", taskCreationDate='" + taskCreationDate + '\'' +
                ", taskIsPrioritized=" + taskIsPrioritized +
                ", taskStatus='" + taskStatus + '\'' +
                '}';
    }

    public String getTaskText() {
        return taskText;
    }

    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }

    public String getTaskCreationDate() {
        return taskCreationDate;
    }

    public void setTaskCreationDate(String taskCreationDate) {
        this.taskCreationDate = taskCreationDate;
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
        return Math.max(this.taskResult, task.taskResult);
    }
}
