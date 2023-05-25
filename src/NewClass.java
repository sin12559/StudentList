/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author donde
 */
class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class StudentArray {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        // Populating the array with classmates' names
        students[0] = new Student("John");
        students[1] = new Student("Emily");
        students[2] = new Student("Michael");
        students[3] = new Student("Sarah");
        students[4] = new Student("David");

        // Iterating over the array and printing each student's name
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
