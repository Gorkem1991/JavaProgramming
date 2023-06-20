package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number");
        int fib = sc.nextInt();
        System.out.println(Arrays.toString(fibonacci(fib)));

    }
    public static int[] fibonacci(int fib)
    {
        int previousNumber =0;
        int []result2=new int[fib];
        int nextNumber =1;
        int sum =0;
        for(int i=0, j=0; i<fib; i++,j++)
        {
            result2[j] = previousNumber;
            sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;

        }
        return result2;
    }
}
