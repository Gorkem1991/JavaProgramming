package practice;

import java.util.Scanner;

public class LastLetterOfString {
    public static void main(String[] args) {
        String [] str = new String[4];
Scanner sc = new Scanner(System.in);
        for (int i = 0; i <str.length; i++) {
            str [i] = sc.nextLine();
            String lastLetter=str[i].substring(str[i].length()-1);
            System.out.println(lastLetter);


        }
    }
}