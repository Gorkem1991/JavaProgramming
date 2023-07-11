package practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BiggestSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biggestNumber = -2147483647;
        int smallestNumber = 2147483647;

        System.out.println("How many numbers do you want to enter");
        int number= sc.nextInt();


        for (int i =0; i<number; i++)
        {
            System.out.println("Enter number " + (i+1));
            int myNumber= sc.nextInt();

            if(myNumber>biggestNumber)
            {
                biggestNumber=myNumber;
            }
           else if(myNumber<smallestNumber)
            {
                smallestNumber=myNumber;
            }
        }

        System.out.println("Biggest number is " + biggestNumber);
        System.out.println("Smallest number is " + smallestNumber);
    }

}
