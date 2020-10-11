package com.oop;

import java.util.ArrayList;

public class University {
    public String name;
    public int foundationYear;
    public Student student;

    private static ArrayList<Student> students;

    public University(String name, int foundationYear) {
        students = new ArrayList<Student>();

        this.name = name;
        this.foundationYear = foundationYear;
    }

    public static void addStudent(float mark, int age, String name) {
        students.add(new Student(name, age, mark));
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public float calcAverageMark() {
        if (students == null) {
            return 0;
        }

        if (students.size() == 0) {
            return 0;
        }

        float sum = 0;

        for (Student student : students) {
            sum += student.mark;
        }

        float average = sum / students.size();
        return average;

//    public static void addStudent() {
    }

}
