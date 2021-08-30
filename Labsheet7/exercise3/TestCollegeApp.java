package Labsheet7.exercise3;

public class TestCollegeApp {
    public static void main(String[] args) {


        Student student1 = new Student("Jake",154345,"Computing");
        Student student2 = new Student("Mary",234532,"Creative Media");
        Student student3 = new Student("Tommy",453726,"Computing");
        Student student4 = new Student("Peter",323456,"Creative Media");

       Student computingStudents[] = new Student[10];
        Student creativeMediaStudents[] = new Student[10];

        //computing students
        computingStudents[0] = student1;

        computingStudents[1] = student3;

        //creative media students
        creativeMediaStudents[0] = student2;
        creativeMediaStudents[1] = student4;

        Department creativeMediaDepartment = new Department("Creative Media",creativeMediaStudents);
        Department computingDepartment = new Department("Computing",computingStudents);

        Department departments[] = new Department[5];
        departments[0] = computingDepartment;
        departments[1] = creativeMediaDepartment;


        Institute instituteOfTechnology = new Institute("Institute of Technology, Tralee",departments);

        System.out.println(instituteOfTechnology);

        System.out.println("Total students in institute: ");
        System.out.println(instituteOfTechnology.getTotalStudents());

        System.out.println("\n\nJake now moving from the Computing dept to the Creative Media dept");

        //The following code will move Jake the "easy" way :-)
        //creativeMediaStudents[2] = s1;
        //s1.setDept("Creative Media");
        //computingStudents[0] = null;

        //this does it the hard way!

        int creativeMediaSubscript = -1, computingSubscript = -1;

        for(int i=0; i<departments.length;i++){
            if(departments[i] != null && departments[i].getName().equals("Creative Media"))
                creativeMediaSubscript = i;

            if(departments[i] != null && departments[i].getName().equals("Computing"))
                computingSubscript = i;
        }

        if(computingSubscript != -1 && creativeMediaSubscript != -1){

            Student [] allDeptStudents = departments[computingSubscript].getStudents();

            int j;

            for(j=0; j<allDeptStudents.length;j++){
                if(allDeptStudents[j] != null){
                    if(allDeptStudents[j].getId() == 154345){
                        System.out.println("\nFound Jake!\n");

                        allDeptStudents[j].setDepartment("Creative Media");

                        departments[creativeMediaSubscript].getStudents()[2] = allDeptStudents[j];
                        allDeptStudents[j] = null;

                        break;
                    }
                }
            }
            if(j ==allDeptStudents.length){
                System.out.println("\nCouldn't find Jake\n");
            }

            System.out.println(instituteOfTechnology);
        }



    }
}
