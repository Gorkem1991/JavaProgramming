package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

public class Test2 {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5};
        double[] arr2={1.2,2.3,3.4,4.5,5.6};
        char[] arr3={'A','B','C','D','E'};
        String[] arr4={"David","Alvira","Igor","Ali"};

        ArraysUtility.printEach(arr1);
        ArraysUtility.printEach(arr2);
        ArraysUtility.printEach(arr3);
        ArraysUtility.printEach(arr4);

        int[] numbers1 = {2,67,3,4,878,34,53,234,76};
        double[] numbers2 = {2.3,67.5,3.6,4.7,878.4,34.3,53.1,234.3,76.5};
        System.out.println(ArraysUtility.maxNumber(numbers1));
        System.out.println(ArraysUtility.maxNumber(numbers2));

        System.out.println(ArraysUtility.minNumber(numbers1));
        System.out.println(ArraysUtility.minNumber(numbers2));

        int[] nos = {2,67,3,4,878,34,53,234,76};
        int no1 = 4;
        System.out.println(ArraysUtility.contains(nos,no1));

        double[] nos2 = {2.6,67.8,3.3,4.4,878.5,34.6,53.7,23.4,7.6};
        double no2 = 4.9;
        System.out.println(ArraysUtility.contains(nos2,no2));

        char[] nos3 = {'A','B','C','D'};
        char no3 = 'C';
        System.out.println(ArraysUtility.contains(nos3,no3));

        String[] nos4 = {"Ali","Jack","Adam","Muhtar"};
        String no4 ="Muhtar";
        System.out.println(ArraysUtility.contains(nos4,no4));

        int []a1 = {1,2,3,4,5,6};
        int no5=4;

        boolean r1 = ArraysUtility.contains(a1,no5);
        System.out.println(r1);
    }
}
