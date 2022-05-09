package com.programming_II_CSC202.Labs.Lab_6.task_1;

// Moutasim El Ayoubi - 1080415
//Task 1
public class Dog extends Animal{
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
    //overloading the AnimaSound method
    public void animalSound(String angry) {
        System.out.println("The angry dog says: growl growl");
        super.animalSound();//try it 
    }
}
