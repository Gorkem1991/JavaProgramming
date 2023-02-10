package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("first number");
        int num1 = sc.nextInt();

        System.out.println("second number");
        int num2 = sc.nextInt();
        System.out.println("math operator");
        char ch = sc.next().charAt(0);

        while(!(ch =='+' || ch =='-'))
        {
            System.out.println("math operator");
            ch = sc.next().charAt(0);
        }
        System.out.println("hi");
    }
}
