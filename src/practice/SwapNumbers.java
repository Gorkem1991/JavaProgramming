package practice;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write First Number");
        int number1 = sc.nextInt();
        System.out.println("Write Second Number");
        int number2 = sc.nextInt();

        System.out.println("--Before swap--");
        System.out.println("First number = " + number1);
        System.out.println("Second number = " + number2);

        int tempnumber1 = number1;
        int tempnumber2 = number2;

            number2=tempnumber1;
            number1=tempnumber2;


        System.out.println("--After swap--");
        System.out.println("First number = " + number1);
        System.out.println("Second number = " + number2);




    }
}
