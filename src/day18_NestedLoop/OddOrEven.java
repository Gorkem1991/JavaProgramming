package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;

        while(true)
        {
        System.out.println("Enter a number");
        int number = sc.nextInt();

       if(number%2 ==0)
       {
           System.out.println(number + " is even");
       }
       else
       {
           System.out.println(number + " is odd");
       }
       System.out.println("Do you want to enter another number");
       answer =sc.next().toLowerCase();

        while(!(answer.equals("yes") || answer.equals("no")))
        {
            System.err.println("Please re enter, do you want to enter another number");
            answer =sc.next().toLowerCase();
        }
        if(answer.equals("no"))
        {
            break;
        }
       }
    }
}
