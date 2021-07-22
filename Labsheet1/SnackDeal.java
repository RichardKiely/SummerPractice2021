package Labsheet1;

import javax.swing.*;

public class SnackDeal {
    public static void main(String[] args) {

        String name;
        String course;
        int snacks;
        int cost = 2;

        name = JOptionPane.showInputDialog("Please enter your name: ");

        course = JOptionPane.showInputDialog("Please enter your course: ");

        snacks = Integer.parseInt(JOptionPane.showInputDialog("How many snacks would you like? "));

        int result = cost * snacks;

        JOptionPane.showMessageDialog(null,"Name: " + name + "\nCourse: " + course +
                "\nSnacks: " + snacks + "\nCost: €"+result +"","Receipt",JOptionPane.INFORMATION_MESSAGE );


    }

}
