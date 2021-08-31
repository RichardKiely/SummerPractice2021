package Labsheet8.exercise1;

import javax.swing.*;

public class TestVehicle {
    public static void main(String[] args) {

        String output="";
        Car c1 = new Car();

        output += "Testing the Car no-arg constructor \n\n" + c1.toString();


        Car c2 = new Car(10000.0,4.5,1.25,2000.0,"Ferrari","F2",2,"05KY1");

        output += "\n\nTesting the multi-arg constructor: \n\n" + c2.toString();


        Bicycle b1 = new Bicycle();

        output += "\n\nTesting the Bicycle no-arg constructor \n\n" + b1.toString();

        Bicycle b2 = new Bicycle(500.0,15,1.0,50.0,"Raleigh","Mountainbike",4,true);

        output += "\n\nTesting the Bicycle multi-arg constructor \n\n" + b2.toString();

        JOptionPane.showMessageDialog(null,output);
    }
}
