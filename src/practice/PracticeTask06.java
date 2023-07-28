package practice;

import java.util.Scanner;

public class PracticeTask06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = input.next();

        int sum=0;//to find the sum of numbers retrieved from the String

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= '0' && str.charAt(i) <= '9' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {

                int digit=str.charAt(i);//to get the value of the char. in ASCII table there is 48 difference between decimal and char value.

                sum=sum+digit;//to sum all numbers
            }

        }System.out.println("sum = " + sum);

    }
}