package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
      int num1 =  input.nextInt();

        System.out.println(num1);

        input.close();

    }
}
