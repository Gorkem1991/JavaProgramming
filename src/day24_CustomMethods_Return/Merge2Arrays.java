package day24_CustomMethods_Return;

import java.util.Arrays;
import java.util.Scanner;

public class Merge2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,7};
        System.out.println(Arrays.toString(arrayMerge(arr1, arr2)));

    }

    public static int[] arrayMerge(int[] arr1, int[] arr2)
    {
        int[] arr3 = new int[arr1.length+ arr2.length];

        for (int i = 0; i<arr1.length; i++)
        {
            arr3[i]=arr1[i];
        }
        for (int i = 0, j=arr1.length; i<arr2.length; i++,j++)
        {
            arr3[j]=arr2[i];
        }

        return arr3;
    }
}
