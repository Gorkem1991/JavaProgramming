package practice;

import java.util.Scanner;

public class PrefixAgain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = "a";
        int n = 2;

        while(str.length()<n)
        {
            System.out.println("Enter a String");
            str = scan.next();
            System.out.println("Enter an Integer");
            n = scan.nextInt();

            System.err.println("Length of String must be smaller than Integer");
        }
        String strSub = str.substring(0, n);

        str = str.replaceFirst(strSub, "");
        if (str.contains(strSub))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}


