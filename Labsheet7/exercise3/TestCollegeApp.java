package Labsheet7.exercise3;

public class TestCollegeApp {
    public static void main(String[] args) {


        Student student1 = new Student("Jake",154345,"Computing");
        Student student2 = new Student("Mary",234532,"Creative Media");
        Student student3 = new Student("Tommy",453726,"Computing");
        Student student4 = new Student("Peter",323456,"Creative Media");

       Student computingStudents[] = new Student[10];
        Student creativeMedia[] = new Student[10];

        //computing students
        computingStudents[0] = student1;
        computingStudents[1] = student3;

        //creative media students
        creativeMedia[0] = student2;
        creativeMedia[1] = student4;

        Department computingDepartment = new Department("Computing",computingStudents);
        Department creativeMediaDepartment = new Department("Creative Media",creativeMedia);



    }
}
