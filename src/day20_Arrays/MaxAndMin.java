package day20_Arrays;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[10];
        int max =-2000000;
        int min = 2000000;
        for (int i = 0; i <numbers.length; i++)
        {
            System.out.println("Enter number "+ (i+1));
            numbers[i] = sc.nextInt();
            if(numbers[i]>max)
            {
                max=numbers[i];
            }
            else if(numbers[i]<min)
            {
                min=numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
