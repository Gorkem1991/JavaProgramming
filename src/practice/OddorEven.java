package practice;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the number");
        int mynumber = sc.nextInt();

        int result = mynumber%2;
        if(result==0)
        {
            System.out.println("Your number is even");
        }
        else
        {
            System.out.println("Your number is odd");
        }

    }
}
