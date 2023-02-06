package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (char i = 'A'; i <='Z'; i++) {

            if(i=='F')
            {
                break;
            }
            System.out.print(i + "");

            while(true)
            {
                System.out.println("Enter a number");
                int num = sc.nextInt();
                if(num<0)
                {
                    break;
                }
            }
        }
    }
}
