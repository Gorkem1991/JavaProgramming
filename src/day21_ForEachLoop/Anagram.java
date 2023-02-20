package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 ="acdb";
        String str2 ="dbca";

        char[] newStr1 =str1.toCharArray();
        char[] newStr2 =str2.toCharArray();

        Arrays.sort(newStr1);
        Arrays.sort(newStr2);

        boolean anagram = Arrays.equals(newStr1,newStr2);

        System.out.println(anagram);
    }
}
