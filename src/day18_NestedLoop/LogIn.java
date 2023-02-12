package day18_NestedLoop;

import java.util.Scanner;
public class LogIn {
    public static void main(String[] args) {
        String username = "Cydeo";
        String password = "WoodenSpoon";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        String u= scan.next();
        System.out.println("Enter your username");
        String p= scan.next();

        if(u.equals("Cydeo") && p.equals("WoodenSpoon"))
        {
            System.out.println("Log in");
        }
        else
        {
            for (int i = 3; i >0 ; i--)
            {
                System.out.println("You have "+ i + " chances to find your password");
                System.out.println("Enter your username");
                u= scan.next();
                System.out.println("Enter your username");
                p= scan.next();

                if(u.equals("Cydeo") && p.equals("WoodenSpoon"))
                {
                    System.out.println("Log in");
                    break;
                }
            }
            if(!(u.equals("Cydeo") && p.equals("WoodenSpoon")))
            {
                System.out.println("Your account has been blocked");
            }
        }
    }
}
