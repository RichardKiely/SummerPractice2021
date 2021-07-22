package Labsheet2;

import javax.swing.*;
import java.util.Arrays;

public class NumbersArray {
    public static void main(String[] args) {
        double [] array = {22.3 , 45.6 , 27.4 , 56.6 , 73.2 , 11.5 , 87.4 , 23.8};
        String message="";

      message += "The largest value int the array is " + laragest(array) +
      "\nThe average value in the array is " + average(array) +
      "\nThe list of values above the average is: " + aboveAverage(array,average(array));

        JOptionPane.showMessageDialog(null,message,"Array Stats",JOptionPane.INFORMATION_MESSAGE);
    }
    public static double laragest(double [] input){
        double largest= input[0];

        for(int i = 1; i<input.length;i++){
            if(input[i]>largest)
                largest = input[i];
        }
        return largest;
    }
    public static double average(double [] input){
        double total=0;

        for(int i=0; i< input.length;i++){
            total += input[i];
        }
        return total/ input.length;
    }
    public static String aboveAverage(double[] input,double average){
        String list="";
        for(int i=0; i< input.length;i++){
            if(input[i] > average)
            list += input[i] + " ";
        }
        return list;

    }
}
