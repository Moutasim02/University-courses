package com.structured_programming_SWE201.Chapter1and2.ClassExercises;


public class CurrentTime {

    public static void main(String[] args) {
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;
        System.out.println("Number of seconds " + totalSeconds);

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;
        currentHour += 4;

        // Display results
        System.out.println("Current time in UAE is " + currentHour + ":"
                + currentMinute + ":" + currentSecond);
    }
}
    

