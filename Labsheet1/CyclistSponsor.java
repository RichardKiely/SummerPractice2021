package Labsheet1;

import javax.swing.*;

public class CyclistSponsor {
    public static void main(String[] args) {

        final float under10k = 1.75f;
        final float over10k = 2.5f;
        String name;
        int cycled;

        name = JOptionPane.showInputDialog("Please enter your name");

        cycled = Integer.parseInt(JOptionPane.showInputDialog("Please enter the distance of km cycled"));

        float result=0;
        if(cycled <= 10){
             result = under10k * cycled;
        }else if(cycled > 10){
            result = (cycled - 10) * over10k + 10*under10k;
        }

        JOptionPane.showMessageDialog(null,"Name" + name + "\nDistance cycled: " +
                cycled + "\nSponorship amount due: €"+String.format("%.2f",result) + "","Receipt",JOptionPane.INFORMATION_MESSAGE);

    }

}
