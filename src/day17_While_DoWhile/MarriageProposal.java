package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Will you marry me ?");
        String answer = sc.next().toLowerCase();

        while(!(answer.equals("yes")  || answer.equals("no")))
        {
            System.err.println("Invalid entry, please re-enter");
            answer = sc.next();
        }
        if(answer.equals("yes"))
        {
            System.out.println("Congrats");
        }
        else
        {
            System.out.println("Bad luck");
        }
    }
}
