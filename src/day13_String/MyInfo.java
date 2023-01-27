package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your gender");
        String gender = sc.next();
        sc.nextLine();
        System.out.println("Enter your full name");
        String fullName = sc.nextLine();
        System.out.println("Enter your phone number");
        long phone = sc.nextInt();
        System.out.println("Enter your zip code");
        int zipCode = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your school name");
        String schoolName = sc.nextLine();
        System.out.println("Enter your city name");
        String cityName = sc.nextLine();
        System.out.println("Enter your state name");
        String state = sc.next();
        System.out.println("Enter your building number");
        int buildingNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your street name");
        String street = sc.nextLine();
         sc.close();

        System.out.println(fullName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(phone);
        System.out.println("\n \t " + buildingNumber + " " + street + "\n\t" + cityName + "," + state + " " + zipCode );
        System.out.println(schoolName);


    }
}
