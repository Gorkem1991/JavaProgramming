package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class MergeTwoArrays2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};

    }
    public static int[] merge(int[] arr1, int[] arr2)
    {
        int[] result = {};

        for (int each: arr1)
        {
            result = ArraysUtility.addElements(result,each);
        }
        for (int each: arr2)
        {
            result = ArraysUtility.addElements(result,each);
        }
        return result;
    }
}
