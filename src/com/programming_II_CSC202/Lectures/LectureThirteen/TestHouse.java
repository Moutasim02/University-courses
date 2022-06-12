package com.programming_II_CSC202.Lectures.LectureThirteen;

public class TestHouse {

    public static void main(String[] args) {

        House h1 = new House(1,1750);
        House h2 = (House) h1.clone();

        System.out.println(h1);
        System.out.println(h2);

        h2.setArea(2000);

        System.out.println("===============================");

        System.out.println(h1);
        System.out.println(h2);

        h2.setWhenBuilt(new java.util.Date(2013,1,1));

        System.out.println("===============================");

        System.out.println(h1);
        System.out.println(h2);
    }

}
