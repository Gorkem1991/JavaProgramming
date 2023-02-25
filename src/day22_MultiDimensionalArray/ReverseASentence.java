package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseASentence {
    public static void main(String[] args) {
        String sentence = "Today is a good day to learn Java";

        String [] words;

        words = sentence.split(" ");

        /* STORE IN ARRAY
        String [] reversedSentence = new String[words.length];

        for (int i = 0; i < words.length; i++)
        {
            reversedSentence[words.length-1-i] = words[i];
        }
        System.out.println(Arrays.toString(reversedSentence));
        */
        String reversedSentence = "";

        for (int i = words.length - 1; i >= 0; i--)
        {
            reversedSentence+= words[i] + " ";
        }
        System.out.println(reversedSentence);

    }
}
