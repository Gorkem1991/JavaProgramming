package day26_CustomMethodsPractice;

import utilities.ArraysUtilitiesPractice;

import java.util.Arrays;

public class ArraysPracticeG {
    public static void main(String[] args) {
        int[] array= {1,1,2,3,4,5};
        int element = 2;

        System.out.println(Arrays.toString(ArraysUtilitiesPractice.arrayMerge(array, element)));

        System.out.println(ArraysUtilitiesPractice.frequency(array, element));
       System.out.println(Arrays.toString(ArraysUtilitiesPractice.uniqueElements(array)));

        System.out.println(Arrays.toString(ArraysUtilitiesPractice.removeElement2(array, element)));

    }
}
