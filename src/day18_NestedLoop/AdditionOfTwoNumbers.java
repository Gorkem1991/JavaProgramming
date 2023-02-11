package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "yes";

        while (answer.equals("yes"))
        {
            System.out.println("Enter your first number");
            int num1 = sc.nextInt();

            System.out.println("Enter your second number");
            int num2 = sc.nextInt();

            System.out.println("Addition: " + (num1+num2));

            System.out.println("Do you want to continue ? yes / no");
             answer = sc.next();

             while(!(answer.equals("yes") || answer.equals("no")))
             {
                 System.err.println("invalid please retry");
                 answer = sc.next().toLowerCase();
             }

        }



    }
}
