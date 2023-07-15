package practice;

import java.util.Scanner;

public class MultiplyingFloatNumbers {
    public static void main(String[] args) {
        Scanner multipyfloatnumbers = new Scanner(System.in);

        System.out.println("Write a number.");
        float number1 = multipyfloatnumbers.nextFloat();


        System.out.println("Write another number.");
        float number2 = multipyfloatnumbers.nextFloat();

        System.out.println("Answer is " + (number1*number2));

    }
}
