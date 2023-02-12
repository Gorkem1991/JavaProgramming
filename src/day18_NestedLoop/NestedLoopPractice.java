package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "yes";

        while (answer.equals("yes")) {
            System.out.println("Enter your age:");
            int age = sc.nextInt();

            while (!(age > 1 && age < 120)) {
                System.out.println("Enter your age:");
                age = sc.nextInt();
            }
            System.out.println("Would you like to continue");
            answer = sc.next();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("wrong answer");
                System.out.println("Would you like to continue");
                answer = sc.next();
            }
            if (answer.equals("no")) {
                break;
            }
        }
    }
}
