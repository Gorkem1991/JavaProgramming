package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveELements {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int element = 2;

        System.out.println(Arrays.toString(ArraysUtility.remove(arr, element)));


    }
}
