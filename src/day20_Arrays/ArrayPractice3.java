package day20_Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter");
        int number = sc.nextInt();
        if(number <=0)
        {
            System.err.println("Invalid Entry");
            System.exit(0);
        }
        int myNumbers[]= new int[number];
        for (int i = 0; i <number; i++)
        {
            System.out.println("Enter your number " + (i+1));
            myNumbers[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(myNumbers));

    }
}
