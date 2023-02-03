package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int result=0;
        for (int i =0; i<=100; i++)
        {
            result = result+i;
        }

        System.out.println(result);
        Scanner sc = new Scanner(System.in);
        int total=0;
        for (int i =1; i<6; i++)
        {
            System.out.println("Enter number 1");
            total+= sc.nextInt();
        }
        System.out.println(total);
    }
}
