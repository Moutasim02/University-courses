package com.programming_II_CSC202.Labs.Lab_8.task_2;

    public class Cat extends Animal{

        public void sound(){
            System.out.println("Meow");
        }

        @Override
        public void type() {
            System.out.println("German");
        }
    }