package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        while(!(age>=1 && age<=120))
        {
            System.err.println("Invalid entry, please re-enter");
            age = sc.nextInt();
        }

        System.out.println("Are you a US citizen ? yes/no");
        String citizen = sc.next();

        while(!(citizen.equals("yes") || (citizen.equals("no"))))
        {
            System.err.println("Invalid entry, please re-enter");
            System.out.println("Are you a US citizen ? yes/no");
            citizen = sc.next().toLowerCase();
        }
        if(age>=18 && citizen.equals("yes"))
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("You are not eligible");
        }


    }
}
