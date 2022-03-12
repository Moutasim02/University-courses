package com.programming_II_CSC202.Activities.Activity_1;

public class StudentTest {
    public static void main(String[] args) {
        Student firstStudent = new Student();
        firstStudent.setStudentID(1079530);
        firstStudent.setGraduationSchool("Al Nahda");
        firstStudent.setAddress("MBZ");
        firstStudent.setMajor("CSE");
        firstStudent.setGpa(4.0);
        firstStudent.setDegree("Bachelor");
        firstStudent.setAge(18);

        System.out.println("Student One identity: \n"+
            firstStudent.getStudentID() + "\n" +
            firstStudent.getGraduationSchool()+ "\n" +
            firstStudent.getAddress()+ "\n" +
            firstStudent.getMajor()+ "\n" +
            firstStudent.getGpa()+ "\n" +
            firstStudent.getDegree()+ "\n" +
            firstStudent.getAge()
        );

    }
}
