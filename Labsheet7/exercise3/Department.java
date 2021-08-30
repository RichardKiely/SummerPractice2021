package Labsheet7.exercise3;

import java.util.Arrays;

public class Department {
    private String name;
    private Student [] students;

    public Department(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Departments: " + getName() +
                " Students: " + Arrays.toString(getStudents());
    }
}
