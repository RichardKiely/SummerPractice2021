package Labsheet1;

import java.util.Scanner;

public class HeightStats {
    public static void main(String[] args) {

        final float average_height = 1.665f;
        float height=0,total=0,smallest=0,count1_3_1_9=0,aboveAvg=0;
        int count=1;

        Scanner input = new Scanner(System.in);
        while(count <= 6){
            System.out.println(" Loop "+ count + " Please enter height: ");
            height = input.nextFloat();

            while(height < 0.5464 || height > 2.72){
                System.out.println(" Loop "+ count + " Height value invalid!! Please re-enter height: ");
                height = input.nextFloat();

            }
            total += height;

            if(count == 1 ){
                smallest = height;
            }else if (height < smallest)
                smallest = height;

            if(height >= 1.3 && height <= 1.9)
                count1_3_1_9++;

            if(height > average_height)
                aboveAvg++;

            count++;

            System.out.println("\n");
        }
        System.out.println("-------------------------------\n" +
                "\tHeight Statistics\n" +
                "-------------------------------\n");

        System.out.println("The average of the heights entered is " + String.format("%.1f",total/count) + "m" +
                "\nThe smalest height value entered is " + smallest + "m" +
                "\nThe number of heights values between 1.3m and 1.9m inclusive is " +(int)count1_3_1_9 +
                "\nThe percentage of height values exceeding the global average height is " +
                String.format("%.2f",(aboveAvg/6f*100)) + "%");
    }
}
