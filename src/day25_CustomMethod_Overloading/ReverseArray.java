package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] numbersReversed = new int[numbers.length];
        System.out.println(Arrays.toString(reverse(numbers, numbersReversed)));

        char[] characters = {'A','B','C','D','E'};
        char[] charactersReversed = new char[characters.length];
        System.out.println(Arrays.toString(reverse(characters, charactersReversed)));
    }
    public static int[] reverse(int[] numbers, int[] numbersReversed)
    {
        for (int i = 0; i < numbers.length; i++)
        {
            numbersReversed[numbers.length-1-i] = numbers[i];
        }
        return numbersReversed;
    }
    private static char[] reverse(char[] characters, char[] charactersReversed)
    {
        for (int i = 0; i < characters.length; i++)
        {
            charactersReversed[characters.length-1-i] = characters[i];
        }
        return charactersReversed;
    }
}
