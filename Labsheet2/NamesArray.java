package Labsheet2;

import javax.swing.*;
import java.util.Arrays;

public class NamesArray {
    public static void main(String[] args) {


        String[] names = new String[5];
             String   longestName="", message="";
             int totalCharacters=0;


        populateArray(names);

        for(int i=0;i<names.length;i++){

            if(names[i].length() > longestName.length())
                longestName = names[i];

            totalCharacters += names[i].length();

        }
        Arrays.sort(names);

        message += "The longest is " + longestName + "\n\nAverage characters per name is " +
                String.format("%.0f",((float)totalCharacters/ names.length)) + " \n\nhe array " +
                " sorted in ascending order is: \n\n" + Arrays.toString(names);

        JOptionPane.showMessageDialog(null,message,"Results",JOptionPane.INFORMATION_MESSAGE);

        
    }
    public static void populateArray(String a[]){

        for(int i=0; i< a.length; i++) {
            a[i] = JOptionPane.showInputDialog("Please enter the name of person " + (i+1));
        }
    }
}
