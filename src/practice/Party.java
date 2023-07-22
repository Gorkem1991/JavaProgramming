package practice;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name="";

        while (true) {
            System.out.println("Please enter the guest's name:");
            name+= input.next();
            System.out.println("Do you want to enter another guest's name?");
            String answer = input.next().toLowerCase();
            if (answer.equals("yes")) {
                System.out.println("Please enter the guest's name:");
                name+= input.next();
                System.out.println("Do you want to enter another guest's name?");
                answer = input.next().toLowerCase();
            }
            if (!(answer.equals("yes"))) {
                name += input.next();
                System.out.println("Guests' list: " + name +", ");
                break;
            }
        }
        input.close();
    }
}
