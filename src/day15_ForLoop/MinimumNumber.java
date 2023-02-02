package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        int smallestNumber=2147483647;
        Scanner sc = new Scanner(System.in);

        for (int i =0; i<5; i++)
        {
            System.out.println("Enter a number");
            int mynumber = sc.nextInt();

            if(mynumber<smallestNumber)
            {
                smallestNumber=mynumber;
            }
        }
        System.out.println("Smallest Number is "+ smallestNumber);
    }
}
