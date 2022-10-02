package com.data_structures_and_algorithms_CSC301.Labs.Lab5;

import java.util.ArrayList;
import java.util.Collections;

public class T3_Test {
    public static void main(String[] args) {

        ArrayList<T3_Author> authors = new ArrayList<>();
        authors.add(new T3_Author("Henry", "Miller", "Born in 1923, ..."));
        authors.add(new T3_Author("Nalo", "Hopkinson", "Published his first book in 2002, ..."));
        authors.add(new T3_Author("Frank", "Miller", "Winner of the 1987 best... "));
        authors.add(new T3_Author("Deborah", "Hopkinson", "Graduated from ..."));
        authors.add(new T3_Author("George R. R.", "Martin", "PhD holdervfrom MIT ..."));

        /*
         * Sorting the list using Collections.sort() method. We can use this method because
         * we have implemented the Comparable interface in our user defined class Author
         */
        Collections.sort(authors);
        for (T3_Author author : authors)
            System.out.println(author.firstName + " " +
                    author.lastName + " " + "Biography: " + author.biography);
    }

}

