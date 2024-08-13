package Nodce;

public class Student {
    String name;
    float cgpa;

    public Student(String name, float cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", CGPA: " + cgpa;
    }
    
}
