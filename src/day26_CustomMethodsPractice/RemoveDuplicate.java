package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,4,5,5};

        System.out.println(Arrays.toString(ArraysUtility.removeDuplicates(numbers)));
    }
}
