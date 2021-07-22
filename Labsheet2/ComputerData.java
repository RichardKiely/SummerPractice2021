package Labsheet2;

import javax.swing.*;

public class ComputerData {
    public static void main(String[] args) {

        String serialNum;
        int hardDiskSpace=0,i=0,numProccessed=0,totalDiskSpace=0;
        String processorType,hardDiskAsString,processorTypeCheapest = "";
        float price,cheapest = 0,dearest = 0;
        String end="";
        boolean valid;

        serialNum = JOptionPane.showInputDialog("Please enter the serial number (<CR> to exit");

        while(!serialNum.equals(""))
        {

            hardDiskAsString = JOptionPane.showInputDialog("Please enter the hard disk space");

            valid = false;
            while(!valid)
            {

                for(i=0; i< hardDiskAsString.length();i++)
                    if(!Character.isDigit(hardDiskAsString.charAt(i)))
                        break;
                    if(i < hardDiskAsString.length())
                        hardDiskAsString = JOptionPane.showInputDialog("Invalid please re-enter hard-disk space");
                    else{
                        hardDiskSpace = Integer.parseInt(hardDiskAsString);

                        if (hardDiskSpace > 50 && hardDiskSpace < 5000)
                            valid = true;
                        else
                            hardDiskAsString = JOptionPane.showInputDialog(
                                    "Invalid! Please re-enter hard-disk space");
                    }
            }
            processorType = JOptionPane.showInputDialog("Please enter the processor type ");

            price = Float.parseFloat(JOptionPane.showInputDialog("Please enter the price "));

            numProccessed++;

            if(numProccessed == 1)
            {
                cheapest = price;
                dearest = price;
                processorTypeCheapest = processorType;
            }else if (price <cheapest){
                cheapest = price;
                processorTypeCheapest = processorType;
            }else if (price > dearest){
                dearest = price;

            }

            totalDiskSpace += hardDiskSpace;

            serialNum = JOptionPane.showInputDialog("Please enter the serial number (<Cr> to exit " );

        }
        if(numProccessed>0)
            JOptionPane.showMessageDialog(null,"\n\nThe average disk space available on the computer" +
                    " processed is: " + String.format("%.0f",averageDiskSpace(totalDiskSpace,numProccessed)) +
            "GB\nThe price range for the computers is from €" + String.format("%.2f",cheapest) +
                    " to € " + String.format("%.2f",dearest) + "\nThe processor type " +
                    "on the cheapest computer is " + processorTypeCheapest , "Computer Stats", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"No data entered!!","Computer Data",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
    public static float averageDiskSpace(int totalDiskSpace,int numProcessed)
    {
        return (float)totalDiskSpace/numProcessed;
    }
}
