package org.example;

import students.HighSchoolStudent;
import students.UniversityStudent;
import students.Student;
import students.StudentManagementSystem;
import students.UniversityStudent;

public class Main {
    public static void main(String[] args) {
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
