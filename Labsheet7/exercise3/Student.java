package Labsheet7.exercise3;

public class Student {
    private int id;
    private String name;
    private String department;

    public Student( String name, int id, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ID: " + getId() +
                " Name: " + getName() +
                " Department: " + getDepartment() + "\n";

    }
}
