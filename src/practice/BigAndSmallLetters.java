package practice;

import java.util.Scanner;

public class BigAndSmallLetters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String evenLetters = "";
        String oddLetters= "";
        String result ="";

       /* for (int i =0; i <word.length() ; i+=2)
        {
            evenLetters ="" +word.charAt(i);
            evenLetters = evenLetters.toUpperCase();
            oddLetters=""+word.charAt(i+1);
            result += evenLetters +oddLetters;
        }*/
        for (int i =0; i <word.length() ; i++)
        {
            String ch =("" + word.charAt(i)).toLowerCase();
            if(i%2==0)
            {
                result+=ch.toUpperCase();
            }
            else
            {
                result+=ch;
            }
        }
        System.out.println("Answer is :" + result);
    }
}
