package Labsheet7.exercise3;

import java.util.Arrays;

public class Institute {
    private String InstituteName;
    private Department [] departments;

    public Institute(String instituteName, Department[] departments) {
        InstituteName = instituteName;
        this.departments = departments;
        getTotalStudents();
    }

    public String getInstituteName() {
        return InstituteName;
    }

    public void setInstituteName(String instituteName) {
        InstituteName = instituteName;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public int getTotalStudents(){
       int totalStudents=0;
       Student[]students;
        for(int i=0; i< departments.length;i++){
            if(departments[i] != null){
                students = departments[i].getStudents();

                for(int j=0; j<students.length;j++){
                    if(students[j] != null){
                        totalStudents++;
                    }
                }

            }
        }
        return totalStudents;
    }

    @Override
    public String toString() {
        String str = " Name: " + getInstituteName() + "\n\n Departments: ";

            for(int i =0; i<getDepartments().length;i++){
                if(departments[i] != null)
                    str +=departments[i];
            }
            return str;

    }
}
