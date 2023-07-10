package practice;

import java.util.Scanner;

public class VowelorConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character");
        char mychar = sc.next().charAt(0);

        switch(mychar)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Your character is vowel");
                break;
            default:
                System.out.println("Your character is consonant");

        }
    }
}
