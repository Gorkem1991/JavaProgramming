package practice;

import java.util.Scanner;

public class ConsonantLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Write a word");
        String word = sc.next();
        String newWord = "";

        for (int i =0; i<word.length(); i++)
        {

            if(word.charAt(i) != 'a' && word.charAt(i) != 'e' && word.charAt(i) != 'i' && word.charAt(i) != 'u' && word.charAt(i) != 'o' )
            {
                newWord=newWord+word.charAt(i);
            }
        }
        System.out.println(newWord);
    }
}
