package day16_ForLoopStringPractice;

import java.util.Scanner;

public class RemoveDuplicatedStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write a string");
        String myString = sc.next();
        String newString="";

        for (int i = 0; i <myString.length() ; i++)
        {
            String ch  =""+myString.charAt(i);
            if(!newString.contains(ch))
            {
                newString+=ch;
            }
        }
        System.out.println(newString);
    }
}
