package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your string");
        String myString = sc.next();

        if(myString.charAt(0) == 'x')
        {
            myString=  myString.replaceFirst("x", "a");
            System.out.println(myString);
        }
    }
}
