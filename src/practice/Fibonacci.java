package practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int result=1;
        int numbera=1;
        int numbero=1;
        for(int i=1; i<10; i++)
        {
            result =   numbero + numbera;
                     numbero=numbera;
                    numbera=result;


            System.out.println(result);

        }

    }
}
