
package day17_While_DoWhile;

import java.util.Scanner;

public class LoginBranchingStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String username = sc.next();
        System.out.println("Enter password");
        String password = sc.next();

        //"Cydeo";
        //"Cydeo123"

        if(username.equals("Cydeo") && password.equals("Cydeo123"))
        {
            System.out.println("Logged in");
        }
        else
        {
            for (int i = 3; i > 0; i--)
            {
                System.err.println("You entered wrong username or password, try again " + i + " attempt left");
                System.out.println("Enter username");
                username = sc.next();
                System.out.println("Enter password");
                password = sc.next();
                if(i==0)
                {
                    System.out.println("blocked");
                    break;
                }

                if(username.equals("Cydeo") && password.equals("Cydeo123"))
                {
                    System.out.println("Logged in");
                    break;
                }
            }
        }
    }
}
