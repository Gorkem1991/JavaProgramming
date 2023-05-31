package practice;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a character");
        char ch = myScanner.next().charAt(0);


        // You can also cast char to int
        int castAscii = (int) ch;


        System.out.println("The ASCII value of " + ch + " is: " + castAscii);

    }
}
