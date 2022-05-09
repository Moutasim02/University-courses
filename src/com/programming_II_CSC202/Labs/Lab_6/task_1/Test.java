package com.programming_II_CSC202.Labs.Lab_6.task_1;

// Moutasim El Ayoubi - 1080415
//Task 1
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cow cow = new Cow();
        Dog dog = new Dog();
        Animal cow2 = new Cow();//polymorphism
        Animal dog2 = new Dog();//polymorphism
        animal.animalSound();
        cow.animalSound();
        dog.animalSound();
        dog.animalSound("angry");//pass any string
        cow2.animalSound();
        dog2.animalSound();
    }
}
