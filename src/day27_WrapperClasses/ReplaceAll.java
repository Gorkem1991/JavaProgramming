package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {

        int[] arr ={10,10,20,30,40,30,30,30};

        arr = ArraysUtility.replaceAll(arr, 30, 300);
        System.out.println(Arrays.toString(arr));
        arr =ArraysUtility.replaceAll(arr, 300, 500);
        System.out.println(Arrays.toString(arr));

    }
}
