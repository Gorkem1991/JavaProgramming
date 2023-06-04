package practice;

import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);

        System.out.println("Write Temperature in Celsius");
        double celsius = abc.nextInt();

        double result = (celsius*1.8)+32;

        System.out.println(celsius + " Celsius is "+ result + " Fahrenheit");


    }
}
