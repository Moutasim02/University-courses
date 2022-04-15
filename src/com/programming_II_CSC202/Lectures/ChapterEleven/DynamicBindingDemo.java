package com.programming_II_CSC202.Lectures.ChapterEleven;

public class DynamicBindingDemo {
    public static void main(String[] args) {
        Person1 g = new GraduateStudent();
        Person1 s = new Student();
        Person1 p = new Person1();
        Object o = new Object();


        Person1 s3 = s;  //implicit casting - you don't need to write it ( done for you )
        Student g2 = (Student) g;
        Student s2 = (Student) s;      //explicit casting - you have to write the casting
        GraduateStudent g3 = (GraduateStudent) g2;

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
