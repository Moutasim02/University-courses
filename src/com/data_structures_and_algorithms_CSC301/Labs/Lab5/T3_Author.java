package com.data_structures_and_algorithms_CSC301.Labs.Lab5;

public class T3_Author implements Comparable<T3_Author> {

    String firstName;
    String lastName;
    String biography;

    T3_Author(String first, String last, String biography) {
        this.firstName = first;
        this.lastName = last;
        this.biography = biography;
    }

    @Override
    /*
     * This is where we write the logic to compare. This method compares
     * automatically by the first name in case that the last name is
     * the same.
     */
    public int compareTo(T3_Author au) {
        /*
         * Comparing by last name. compareTo should return < 0 if last name of this(keyword)
         * instance is less than last name of input instance au, > 0 if this is greater than
         * object au, and 0 if they are equal.
         */
        int last = this.lastName.compareTo(au.lastName);
        //Sorting by first name if last name is same d
        if (last == 0)
            return this.firstName.compareTo(au.firstName);
        else
            return last;
    }
}
