package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String username = sc.next();
        System.out.println("Enter password");
        String password = sc.next();

        int times = 3;

        //"Cydeo";
        //"Cydeo123"

        while(!(username.equals("Cydeo") && password.equals("Cydeo123")) && times > 0)
        {
            times--;
            System.err.println("You entered wrong username or password, try again " + (times+1) + " attempt left");
            System.out.println("Enter username");
            username = sc.next();
            System.out.println("Enter password");
            password = sc.next();

        }
        if(username.equals("Cydeo") && password.equals("Cydeo123"))
        {
            System.out.println("Logged in");
        }
        else
        {
            System.out.println("blocked");
        }
    }
}
