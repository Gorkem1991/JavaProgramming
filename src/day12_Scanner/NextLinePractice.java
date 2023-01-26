package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter age");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter Full name");
        String fullName = input.nextLine();

        System.out.println("Enter GPA");
        double gpa = input.nextDouble();

        input.nextLine();

        System.out.println("Enter School Name");
        String schoolName = input.nextLine();

        System.out.println("Your name is " + fullName + ". Your age is " + age + ". Your school is " + schoolName);


    }
}
