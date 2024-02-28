package students;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private int i;
    private String searchName;
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Age " + student.getAge());
            System.out.println("Course " + student.getCourse());

            if (student instanceof HighSchoolStudent) {
                System.out.println("Grade: " + ((HighSchoolStudent) student).getGrade());
            } else if (student instanceof UniversityStudent) {
                System.out.println("Major: " + ((UniversityStudent) student).getMajor());
            }
            continue;
        }
    }

    public void searchStudentByName(String searchName) {
        i = 0;
        for (Student student : students) {
            if (searchName.equals(student.getName())) {
                i++;
                System.out.println("Name: " + student.getName());
                System.out.println("Age " + student.getAge());
                System.out.println("Course " + student.getCourse());
                if (student instanceof HighSchoolStudent) {
                    System.out.println("Grade: " + ((HighSchoolStudent) student).getGrade());
                } else if (student instanceof UniversityStudent) {
                    System.out.println("Major: " + ((UniversityStudent) student).getMajor());
                }
            }}
            if ( i == 0) {
                System.out.println("This student is not in the list.");
            }
        }


}








// Search student by name -> searchStudentByName
