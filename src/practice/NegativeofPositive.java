package practice;

import java.util.Scanner;

public class NegativeofPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter number");
            int number1 = sc.nextInt();

            if(number1>0)
            {
                System.out.println("Positive number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
    }
}
