package com.oop;



public class Main {
    public static void printStudents(University u) {
        System.out.println(u.name + " : " + u.foundationYear);
        int size = u.getStudents().size();
        System.out.println("Students : " + (size > 0 ? size + " : ": size));
        for (Student student: u.getStudents()) {
            System.out.println(student);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        University university = new University("UTM",1990);
        university.addStudent(8,20,"Ion");
        University.addStudent(9,21,"Petru");
        University.addStudent(7,19,"Oleg");
        printStudents(university);
        System.out.println("Average " + university.name + " : " + university.calcAverageMark());
        System.out.println("--------------------------");

        University university1 = new University("University of jokes",1800);
        University.addStudent(6,20,"Andrei");
        University.addStudent(9,21,"Igor");
        University.addStudent(7,19,"Vlad");
        System.out.println(university1.foundationYear+university1.name);
        System.out.println("Average " + university1.name + " : " + university1.calcAverageMark());
        System.out.println("--------------------------");

        University university2 = new University("University of building",2010);
        University.addStudent(6,20,"Cristian");
        University.addStudent(8,21,"Lilian");
        University.addStudent(7,19,"Stefan");
        System.out.println(university2.foundationYear+university2.name);
        System.out.println("Average " + university2.name + " : " + university2.calcAverageMark());
        System.out.println("--------------------------");
        System.out.println();


    }
}
