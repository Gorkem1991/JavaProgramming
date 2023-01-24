package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter full name");
        String name = input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your school name");
        String schoolName = input.nextLine();

        System.out.println("schoolName = " + name);
        System.out.println("schoolName = " + age);
        System.out.println("schoolName = " + schoolName);

        //nextLine(): If we are using nextLine()  method after the other methods of scanner, we must provide one addition nextLine()
        input.close();
    }
}
