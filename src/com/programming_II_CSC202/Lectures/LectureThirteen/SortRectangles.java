package com.programming_II_CSC202.Lectures.LectureThirteen;

public class SortRectangles {

    public static void main ( String [] a) {

        ComparableRectangle[] rectangles = {
                new ComparableRectangle(3.4, 5.4),
                new ComparableRectangle(13.24, 55.4),
                new ComparableRectangle(7.4, 35.4),
                new ComparableRectangle(1.4, 25.4)};

        java.util.Arrays.sort(rectangles);

        for ( Rectangle rect : rectangles) {
            System.out.println(rect);
        }
    }

}