package day16_ForLoopStringPractice;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "aaabccc";
        //            0123456

        String result = ""; //"b"


        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch))
            {
                result += ch;
            }

        }
        System.out.println(result);

    }
}
