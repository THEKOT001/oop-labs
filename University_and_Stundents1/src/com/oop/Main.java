package com.oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //creating students
//        Student student1 = new Student(19,8,"Ion");
//        Student student2 = new Student(19,7,"Oleg");
//        Student student3 = new Student(8,9,"Maxim");
//        //assigning age to students
//        student1.age=19;
//        student2.age=19;
//        student3.age=20;
//        //assigning marks to students
//        student1.mark=8;
//        student2.mark=7;
//        student3.mark=9;
//        //assigning names to students
//        student1.name="Ion";
//        student2.name="Oleg";
//        student3.name="Maxim";

        University university = new University("UTM",1990);
        University.addStudent(8,20,"Ion");
        University.addStudent(9,21,"Petru");
        University.addStudent(7,19,"Oleg");


//        university.name="UTM";
//        university.foundationYear=1990;
//        System.out.println(university.name + university.anul + university.student);
//        university.student[0]=student1;
//        university.student[1]=student2;
//        university.student[2]=student3;
//        System.out.println(student1);
    }
}
