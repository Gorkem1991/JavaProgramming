package day15_ForLoop;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your string");
        String myString = sc.next();

            myString=  myString.replace("x", "a").replace("X","a");

        System.out.println(myString);

        }

    }
