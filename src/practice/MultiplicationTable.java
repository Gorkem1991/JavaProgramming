package practice;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int mynumber = sc.nextInt();

        for (int i = 0; i<13; i++)
        {
            System.out.println(i + " x " + mynumber +" = " + (i*mynumber));
        }

    }
}
