package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        System.out.println(Arrays.toString(ArraysUtility.replace(arr, 2, 30)));
        double arr2[] = {1.1,2.1,3.1,4.1,5.1};
        System.out.println(Arrays.toString(ArraysUtility.replace(arr2, 2, 777.7)));

    }
}
