package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        int biggestNumber = -2147483648;
        Scanner sc = new Scanner(System.in);

        for (int i =0; i<5; i++)
        {
            System.out.println("Enter a number");
            int mynumber = sc.nextInt();

            if(mynumber>biggestNumber)
            {
                biggestNumber=mynumber;
            }
        }
        System.out.println("Biggest Number is "+ biggestNumber);
    }
}
