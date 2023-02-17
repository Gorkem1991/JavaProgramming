package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myGroup[] = new String[5];

        myGroup[0]="Günay";
        myGroup[1]="Neira";

        System.out.println(Arrays.toString(myGroup));

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        System.out.println(Arrays.toString(days));

        int number =5;

        if(number <1 || number >7)
        {
            System.err.println("Invalid number");
            System.exit(0);
        }

        System.out.println(days[number-1]);


        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        int numberMonths =7;

        if(numberMonths <1 || numberMonths >12)
        {
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(months[numberMonths-1]);

/*
        for (int i = 0; i <myGroup.length; i++) {
            System.out.println("Enter name " + (i+1));
            myGroup[i]=sc.next();
        }
        for (int i = 0; i <myGroup.length; i++) {
            System.out.println(myGroup[i]);
        }
*/

    }
}
