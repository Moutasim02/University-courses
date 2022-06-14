package com.programming_II_CSC202.Lectures.ChapterThirteen;

public class ComparableRectangle extends Rectangle
        implements Comparable <ComparableRectangle>{

    public ComparableRectangle (double height, double width) {

        super(height,width);

    }
    @Override
    public int compareTo(ComparableRectangle o) {
        if ( getArea() > o.getArea())
            return 1;
        else if ( getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return " width : " + getWidth() +
                "\t Height : " + getHeight() +
                "\t Area : " + getArea();
    }


}