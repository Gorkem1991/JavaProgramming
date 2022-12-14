package day01_JavaIntro;

import day24_CustomMethods_Return.ReturnMethodIntro;
import day24_CustomMethods_Return.ReturnMethodsPractice4;
import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str1 = "sfsdfdsdsaaasssdbb";
        System.out.println(ReturnMethodsPractice4.removeDuplicate(str1));
        String name = "Java Programming";
        String reversedaName = ReturnMethodIntro.reverse(name);
        System.out.println(reversedaName);

        String str = "Wooden Spoon";
        StringUtility.printEachChar(str);

        String word = "civic";
        System.out.println(StringUtility.palindrome(word));

        String names[] = {"Anna","Java","Python","racecar","Mom","Cydeo"};

        System.out.println(StringUtility.numberOfPalindromes(names));

        String word1 = "letter";
        String word2 = "telter";

        System.out.println(StringUtility.isAnagram(word1, word2));

        String myString1 = "aaaabbbbbccc";
        System.out.println(StringUtility.removeDuplicates(myString1));
    }
}
