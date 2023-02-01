package day15_ForLoop;
import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your First Name");
        String firstName = sc.next();
        System.out.println("Write your Last Name");
        String lastName = sc.next();


        firstName= firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName= lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName + lastName);
        System.out.println();
    }
}
