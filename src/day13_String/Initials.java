package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();


        char firstnameInitial = firstName.charAt(0);
        char lastnameInitial = lastName.charAt(0);

        String initial = "" + firstnameInitial + "." + lastnameInitial;
        System.out.println(initial);

    }
}
