package practice;

import java.util.Scanner;

public class TestNew {

    public static int wordCount(String words) {
        // your code
        String []length1 = words.split(" ");

        int counter =0;
        for (int i = 0; i < length1.length; i++)
        {
            if(!length1[i].equals(""))
            {
                counter++;
            }
        }
      return counter;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
}
