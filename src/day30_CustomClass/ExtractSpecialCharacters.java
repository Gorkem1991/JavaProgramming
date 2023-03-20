package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractSpecialCharacters {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            letters.add(c);
            digits.add(c);
            specialChars.add(c);
        }

        letters.removeIf(p->!Character.isLetter(p));
        digits.removeIf(p->!Character.isDigit(p));
        specialChars.removeIf(p->Character.isLetterOrDigit(p));

        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);

    }
}
