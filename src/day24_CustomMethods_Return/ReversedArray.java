package day24_CustomMethods_Return;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        int[] reversedArray = new int[myArray.length];

        System.out.println(Arrays.toString(reverseTheArray(myArray, reversedArray)));
    }
    public static int[] reverseTheArray(int[] myArray, int[] reversedArray)
    {
        for (int i = myArray.length - 1; i >= 0; i--)
        {
            reversedArray[myArray.length-i-1]=myArray[i];
        }
        return reversedArray;
    }
}
