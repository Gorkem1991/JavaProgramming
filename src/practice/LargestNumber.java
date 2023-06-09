package practice;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int number1 = sc.nextInt();

        System.out.println("Enter another number");
        int number2 = sc.nextInt();

        System.out.println("Enter last number");
        int number3 = sc.nextInt();

        if(number1>number2 && number1 >number3)
        {
            System.out.println("biggest number is " + number1);
        }
        else if (number2>number1 && number2 >number3)
        {
            System.out.println("biggest number is " + number2);
        }
        else
        {
            System.out.println("biggest number is " + number3);
        }
    }
}
