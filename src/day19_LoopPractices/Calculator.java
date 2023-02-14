package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter numver");
        int num1 = sc.nextInt();

        System.out.println("enter math operator");
        char operator = sc.next().charAt(0);

        if(!(operator == '+'||operator=='-'))
        {
            System.err.println("invalid opeator : " + operator);
            System.exit(0);
        }
        System.out.println("enter a number");
        int num2 = sc.nextInt();
    }
}
