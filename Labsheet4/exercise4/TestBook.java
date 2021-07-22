package Labsheet4.exercise4;

import javax.swing.*;
import java.awt.*;

public class TestBook {
    public static void main(String[] args) {
        String output = "";
        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);

       textArea.setText(String.format("%-25s%-9s%-15s%s","Title ","Price ","ISBN","Pages"));


       /* Book b1 = new Book();

        output += "Calling the no-argument Book constructor. The first Book object details are: \n\n" + b1.toString();

        Book b2 = new Book("The Davinci Code ",19.99,"  3452617232 ",348);

        output += "\n\nCalling the multi-argument Book constructor. The second Book object details are: \n\n" + b2.toString();*/

        String title = JOptionPane.showInputDialog("Please enter the title of your favourite book");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your favourite book"));
        String isbn = JOptionPane.showInputDialog("Please enter the ISBN of your favourite book");
        int pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages in your favourite book"));


        Book favouriteBook = new Book(title,price,isbn,pages);

        output += String.format("\n\n%-25s%-9.2f%-15s%d",favouriteBook.getTitle(),favouriteBook.getPrice(),favouriteBook.getISBN(),
                favouriteBook.getPages());

        String leastFavTitleBook = JOptionPane.showInputDialog("Please enter the title of your least favourite book");
        double leastPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your least favourite book"));
        String leastISBN = JOptionPane.showInputDialog("Please enter the ISBN of your least favourite book");
        int leastPages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages in your least favourite book"));

        Book leastFav = new Book(leastFavTitleBook,leastPrice,leastISBN,leastPages);

        output += String.format("\n\n%-25s%-9.2f%-15s%d",leastFav.getTitle(),leastFav.getPrice(),leastFav.getISBN(),
                leastFav.getPages());

        textArea.append(output);
        JOptionPane.showMessageDialog(null,textArea,"Book Object Data",JOptionPane.INFORMATION_MESSAGE);
    }
}
