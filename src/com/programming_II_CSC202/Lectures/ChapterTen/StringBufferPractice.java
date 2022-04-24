package com.programming_II_CSC202.Lectures.ChapterTen;

// Makes string mutable
// Difference from String Builder is:used when we are using multithreading as StringBuilder isn't synchronised (thread-safe).
public class StringBufferPractice {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Moutasim");
//        sbf.append("ssd");
//        sbf.insert(3,"EXTRA");
//        sbf.delete(2,5); //5 is exclusive
//        sbf.deleteCharAt(5);
//        sbf.replace(2,5,"EXTRA"); // 5 is exclusive
//        sbf.setCharAt(2,'d');
//        sbf.reverse();
//        sbf.setLength(4); // 4 is exclusive

        System.out.println(sbf.capacity()); // Already written characters + 16 =24, else it will be 16 only
        System.out.println(sbf.charAt(sbf.length() - 1));
    }
}
