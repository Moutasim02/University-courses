package com.programming_II_CSC202.Lectures.ChapterEleven;

import javafx.scene.Parent;

public class DynamicBindingDemo {
    public static void main(String[] args) {
        Person1 g = new GraduateStudent(); // GraduateStudent created from the parent of the parent class
        Person1 s = new Student(); // Student created from parent class
        Person1 p = new Person1(); // Normal creation of object
        Object o = new Object(); // Normal creation of object


        // Implicit casting when the object created from child
        Person1 s3 = s;  //implicit casting - you don't need to write it ( done for you )

        // Explicit same level or higher
        Student g2 = (Student) g;
        Student s2 = (Student) s;      //explicit casting - you have to write the casting
        GraduateStudent g3 = (GraduateStudent) g2;




        // if (s3 instanceof Parent) // Can't be instanceof Parent as it's assigned to Student(Child)

        if (s3 instanceof Student)
            System.out.println("Yes, created a an object of Type Student ");

        if (s2 instanceof Student)
            System.out.println("YES");
        else
            System.out.println("NO");

        System.out.println(g);
        System.out.println(s);
        System.out.println(p);
        System.out.println(o);
    }
}


class GraduateStudent extends Student {
    @Override
    public String toString() {
        return "GraduateStudent";
    }
}

class Student extends Person1 {

}

class Person1 extends Object {
    @Override
    public String toString() {
        return "Person";
    }
}
