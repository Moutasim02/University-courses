package com.programming_II_CSC202.Lectures.LectureThirteen;

public class House implements Cloneable, Comparable <House> {

    private int id;
    private double area;
    private java.util.Date whenBuilt;
    public House(int id, double area) {

        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public java.util.Date getWhenBuilt() {
        return whenBuilt;
    }
    public void setWhenBuilt(java.util.Date whenBuilt) {
        this.whenBuilt = whenBuilt;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
    }
    @Override
    public int compareTo(House o) {
        if ( area > o.area)
            return 1;
        else if ( area < o.area)
            return -1;
        else
            return 0;
    }
    @Override
    public String toString() {
        return " id : " + id +
                "\t Area : " + area +
                "\tBuilding Date : " + whenBuilt;
    }


}