package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args)
    {
        String str ="Java";
        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for(char each: chars)
        {
            System.out.println(each);
        }

        String sentence ="Wooden Spoon";

        String[] words = sentence.split(" ");


        System.out.println(Arrays.toString(words));

        String email ="WoodenSpoon@cydeo.com";

       String newMail[] = email.split("@");

        System.out.println(Arrays.toString(newMail));

        String s ="gorkemagac@gmail.com";

        String[] sentences =s.split("\\.");

        System.out.println(Arrays.toString(sentences));

        for (String sentence1 : sentences)
        {
            String newSentence[] = sentence1.split("@");
            System.out.println(Arrays.toString(newSentence));

        }

    }
}
