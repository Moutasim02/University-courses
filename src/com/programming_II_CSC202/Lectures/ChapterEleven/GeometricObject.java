package com.programming_II_CSC202.Lectures.ChapterEleven;
import java.util.Date;

public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    /** Construct a default geometric object */
    public GeometricObject() {
        System.out.println("Creating a GeometricObject object using DEFAULT constructor");
        dateCreated = new Date();
    }

    /** Construct a geometric object with the specified color
     *  and filled value */
    public GeometricObject(String color, boolean filled) {
        System.out.println("Creating a GeometricObject object using NON-DEFAULT constructor");
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
     its get method is named isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }


}
