package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String sentence = "I Love Java";

        String words[] = sentence.split(" ");

        String reverse = "";

        for (int i = words[1].length() - 1; i >= 0; i--) {
            reverse+=words[1].charAt(i);
        }
        sentence = sentence.replaceFirst(words[1], reverse);
        System.out.println(sentence);

        /*
        for (int i = 0; i < words.length; i++)
        {
            if(i==1)
            {
                for (int i1 = words.length; i1 >= 0; i1--)
                {
                    reverse+= ""+words[i].charAt(i1);
                }
                reverse+= " ";
            }
            else
            {
                reverse+=words[i] + " ";
            }
        }
        System.out.println(reverse);
        */
    }
}
