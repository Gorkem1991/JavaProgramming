package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4};
        int[] intArray2 = {5,6};
        int[] intArray3 = new int[intArray.length+intArray2.length];
        intArray3=merge(intArray, intArray2,intArray3);

        double[] doubleArray = {1.1,2.2,3.3,4.4};
        double[] doubleArray2 = {5.5,6.6};
        double[] doubleArray3 = new double[doubleArray.length+doubleArray2.length];
        doubleArray3=merge(doubleArray, doubleArray2,doubleArray3);

        System.out.println(Arrays.toString(doubleArray3));
    }

    public static int[] merge(int[] intArray, int[] intArray2,int []intArray3)
    {

        for (int i = 0; i < intArray.length; i++)
        {
            intArray3[i] = intArray[i];
        }
        for (int i = 0, j =intArray.length; i < intArray2.length; i++,j++)
        {
            intArray3[j] = intArray2[i];
        }

        return intArray3;
    }
    public static double[] merge(double[] doubleArray, double[] doubleArray2,double []doubleArray3)
    {

        for (int i = 0; i < doubleArray.length; i++)
        {
            doubleArray3[i] = doubleArray[i];
        }
        for (int i = 0, j =doubleArray.length; i < doubleArray2.length; i++,j++)
        {
            doubleArray3[j] = doubleArray2[i];
        }

        return doubleArray3;
    }
}
