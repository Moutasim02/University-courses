package com.programming_II_CSC202.Labs.Lab_6.task_2;

public class Test {
    public static void main(String[] args) {
        Bird e1 = new Eagle();
        Eagle e2 = new Eagle(); //2 eagles
        Bird b1 = new Bird(); // 1 bird
        System.out.println(e1 instanceof Bird);
        System.out.println(e2 instanceof Bird);
        System.out.println(e2 instanceof Eagle);

        if (b1 instanceof Eagle) {
            Eagle e3 = (Eagle) b1;
            System.out.print(e3);
        } else {
            System.out.println("TypeCasting cant be done");
        }
    }
}
