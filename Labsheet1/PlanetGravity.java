package Labsheet1;

import java.util.Scanner;

public class PlanetGravity {
    public static void main(String[] args) {
        final double g = 9.81;

        double Mp;
        double Me;
        double Re;
        double Rp;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the mass of the planet Earth ");
        Me = input.nextDouble();

        System.out.println("Please enter the radius of planet Earth ");
        Re = input.nextDouble();

        System.out.println("Please enter the mass of the other planet ");
        Mp = input.nextDouble();

        System.out.println("Please enter the radius of the other planet ");
        Rp = input.nextDouble();

        double gp = (g*Mp*Re*Re)/(Me*Rp*Rp);

        System.out.println("The acceleration due to gravity on the other planet is " + String.format("%.2f",gp)+ "m/s/s");


    }
}
