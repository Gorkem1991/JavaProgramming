package day16_ForLoopStringPractice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your string");
        String myString = sc.next();
        String newString="";

        for (int i = myString.length()-1; i >=0; i--)
        {
            newString+=myString.charAt(i);
        }
        System.out.println(newString);
    }
}
