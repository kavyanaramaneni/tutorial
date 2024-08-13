package Nodce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Comparing_cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        List<Student> array = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter student CGPA: ");
            float cgpa = sc.nextFloat();
            sc.nextLine(); // Consume newline

            Student student = new Student(name, cgpa);
            array.add(student);
        }

        // Bubble Sort
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.size() - 1; i++) {
                Student student1 = array.get(i);
                Student student2 = array.get(i + 1);

                if (student1.cgpa < student2.cgpa ||
                    (student1.cgpa == student2.cgpa && student1.name.compareTo(student2.name) > 0)) {
                    Student temp = student1;
                    array.set(i, student2);
                    array.set(i + 1, temp);
                    swapped = true;
                }
            }
        } while (swapped);

        // Print sorted list
        for (Student student : array) {
            System.out.println(student);
        }

        sc.close();
    }
    
}
