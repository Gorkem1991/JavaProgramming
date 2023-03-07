package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class FrequencyOfElements {
    public static void main(String[] args) {

        int[] myNumbers = {1,3,7,4,9,8,3,5,4,7,6,2,4,8,9,5,4,2,3,4,5,7,0,9,5,6,4,3,2};
        int element = 5;
        int n = ArraysUtility.frequency(myNumbers,element);

        int[] myNumbers2 = {2,3,4,4,3,1,5};
        System.out.println(Arrays.toString(ArraysUtility.uniqueElements(myNumbers2)));

        double[] myNumbers3 = {2.2,3.3,4.4,4.4,3.3,1.1,5.5};
        System.out.println(Arrays.toString(ArraysUtility.uniqueElements(myNumbers3)));

    }


}
