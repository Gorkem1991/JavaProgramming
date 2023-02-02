package day15_ForLoop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String myString = sc.nextLine();
        String myNewString="";
        int length = myString.length();

        for (int i =length-1; i>=0; i--)
        {
           myNewString = myNewString + myString.charAt(i);
        }
        System.out.println(myNewString);
    }
}
