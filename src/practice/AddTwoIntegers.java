package practice;

import java.util.Scanner;

public class AddTwoIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write a number.");
        int number1 = input.nextInt();

        System.out.println("Write another number.");
        int number2 = input.nextInt();

        System.out.println("Addition of these two numbers is " + (number1 + number2));

    }
}
