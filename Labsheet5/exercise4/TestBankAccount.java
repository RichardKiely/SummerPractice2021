package Labsheet5.exercise4;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {
        String text="";


        BankAccount b1 = new BankAccount();

        text += "Calling the no-argument BankAccount constructor. " +
                "The first BankAccount object details are: \n\n" + b1.toString();

        BankAccount b2 = new BankAccount("Richy Rich", 23422343,0.75);

        text += "\n\nCalling the multi-argument constructor. " +
                "The second BankAccount object details are: \n\n " + b2.toString();

       // BankAccount.setInterestRate(0.5);

        text += "\n\nNow calling the setInterestRate() method to change the interest rate to 0.5. " +
                "\n\nThe first BankAccount object details are: \n\n" + b1.toString() +
                "\n\nThe second BankAccount object details are: \n\n" + b2.toString();

        JOptionPane.showMessageDialog(null,text,"BankAccount Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
