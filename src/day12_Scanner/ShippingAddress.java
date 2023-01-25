package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your building number");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter your street name");
        String streetName = input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state");
        String stateName = input.next();

        System.out.println("Enter your zip code");
        String zipCode = input.next();

        input.nextLine();

        System.out.println("Enter your country ");
        String country = input.nextLine();

        System.out.println("Your Shipping address is: " + fullName + " , "+ buildingNumber + " , " + stateName + " , " +stateName+" " + cityName+ " " + zipCode);
    }
}
