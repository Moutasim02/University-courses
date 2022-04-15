package com.programming_II_CSC202.Lectures.ChapterEleven;

public class TestFruit {
    public static void main(String[] args) {

        Fruit f1 = new Apple();   // of type Fruit
        Apple f2 = new Apple();   // of type Apple
        Orange f3 = new Orange();  //of type Orange
        Fruit f4 = new Orange();   // of type Fruit
        Object f5 = new Apple();


        if ( f5 instanceof Apple)
            System.out.println("it is Apple");
        else if ( f5 instanceof Orange)
            System.out.println("it is Orange");
        else
            System.out.println("it is Fruit");

    }

}
