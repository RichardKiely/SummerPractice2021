package Labsheet1;

import java.util.Scanner;

public class TextAnalyser {
    public static void main(String[] args) {

        String text,shortestText="";
        char ch,nextCH=' ';
        int i=1,j,vowels,words,totalWords=0,edCount;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter a piece of text " + i + ":");
            text = input.nextLine();

          j=0;
          words=0;
          vowels=0;
          edCount=0;

          while(j<text.length()){
              ch = text.charAt(j);

              if(j<text.length()-1)
                  nextCH = text.charAt(j+1);

              if(ch=='a' || ch=='i' || ch=='o' ||ch=='u' || ch=='e')
                  vowels++;

              if(ch==' ')
                  words++;

              if(ch=='e' && nextCH=='d')
                  edCount++;
              j++;
          }
            System.out.println("\n\n\t\t********Text Data*******" +
                    "\n\nNumber of Characters: " + text.length() +
                    "\nNumber of lowercase vowels " + vowels +
                    "\nNumber of words: " + (words+1) +
                    "\nNumber of times \"ed\" appears in the text: " + edCount + "\n\n\n");

          if(i==1)
              shortestText=text;
          else if(text.length()<shortestText.length())
              shortestText=text;

          totalWords+=(words+1);

          i++;


        }while(i<=3);

        System.out.println("\n\n\t\t*******Overall results********" +
                "\n\nShortest piece of text: " + shortestText +
                "\nAverage number of words: " + String.format("%.0f",(totalWords/3f)) + "\n\n");
    }
}
