// File: StudentList.java
package code;

import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<Student> std = new ArrayList<>();

        Student student1 = new Student(1, "Sonali", 9987384757L, "BSc-IT", "soulmaurya369@gmail.com");
        Student student2 = new Student(2, "Jack", 541132545L, "BSc-IT", "soulmaurya369@gmail.com");
        Student student3 = new Student(3, "Sunny", 545451584L, "BSc-IT", "soulmaurya369@gmail.com");
        Student student4 = new Student(4, "Raj", 9987384757L, "BSc-IT", "soulmaurya369@gmail.com");
        Student student5 = new Student(5, "Sonu", 9987384757L, "BSc-IT", "soulmaurya369@gmail.com");

        std.add(student1);
        std.add(student2);
        std.add(student3);
        std.add(student4);
        std.add(student5);

        // Display all students
        for (Student student : std) {
            System.out.println(student);
        }
    }
}
