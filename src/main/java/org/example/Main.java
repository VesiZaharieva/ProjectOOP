package org.example;

import students.HighSchoolStudent;
import students.UniversityStudent;
import students.Student;
import students.StudentManagementSystem;
import students.UniversityStudent;

public class Main {
    public static void main(String[] args) {
        // Cat cat = new Cat();
        //cat.setName("Tom");
        //cat.setAge(2);
        //cat.setWeight(10);
        //system.out.println(cat.getName());

        //Cat cat2 = new Cat("Alex", 3, 80);
        //System.out.println(cat2.getName());

        StudentManagementSystem system = new StudentManagementSystem();
        Student alice = new HighSchoolStudent("Alice", 16, "Math", 10);
        Student bob = new UniversityStudent("Bob", 26, "IT", "QA");

        system.addStudent(bob);
        system.addStudent(alice);

        system.searchStudentByName("Alice");
        system.searchStudentByName("Aaa");
        system.searchStudentByName("Bob");
        System.out.println("All students:");
        system.displayAllStudents();

    }


}