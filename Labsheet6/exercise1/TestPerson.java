package Labsheet6.exercise1;

import javax.swing.*;

public class TestPerson {
    public static void main(String[] args) {

        String output="*****Person Class Tester*****\n\n";
        Person p1 = new Person();

        output += "Calling the Person() constructor...." +
                "\nValue of the Person object is: " + p1.toString();

        String fName = JOptionPane.showInputDialog("Please enter the first name of the second person");
        String lName = JOptionPane.showInputDialog("Please enter the last name of the second person");

        Person p2 = new Person(fName,lName);

        output += "\n\nCalling the Person(String,String) constructor...." +
                "\nValue of the second person object is: " + p2.toString();

        JOptionPane.showMessageDialog(null,output," " ,JOptionPane.INFORMATION_MESSAGE);

    }
}
