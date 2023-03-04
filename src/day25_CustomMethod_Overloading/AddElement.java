package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int[] intArray={1,2,3,4};
        int newElement = 5;
        intArray = addNewInteger(intArray,newElement);
        System.out.println(Arrays.toString(intArray));

        double[] doubleArray={1.1,2.2,3.3,4.4};
        double newElement2 = 5.5;
        doubleArray = addNewDouble(doubleArray,newElement2);
        System.out.println(Arrays.toString(doubleArray));

        char[] charArray={'A','B','C','D'};
        char newElement3 = 'E';
        charArray = addNewChar(charArray,newElement3);
        System.out.println(Arrays.toString(charArray));

        String[] stringArray={"Ali","Muhtar","Jack","Nadir"};
        String newElement4 = "Adam";
        stringArray = addNewString(stringArray,newElement4);
        System.out.println(Arrays.toString(stringArray));
    }

    public static int[] addNewInteger(int intArray[], int newElement)
    {
        int[] newIntArray = new int[intArray.length+1];
        for (int i = 0; i <intArray.length; i++)
        {
            newIntArray[i]=intArray[i];
        }
        newIntArray[newIntArray.length-1]=newElement;

        return newIntArray;
    }
    public static double[] addNewDouble(double doubleArray[], double newElement2)
    {
        double[] newDoubleArray = new double[doubleArray.length+1];
        for (int i = 0; i <doubleArray.length; i++)
        {
            newDoubleArray[i]=doubleArray[i];
        }
        newDoubleArray[newDoubleArray.length-1]=newElement2;

        return newDoubleArray;
    }
    public static char[] addNewChar(char charArray[], char newElement3)
    {
        char[] newCharArray = new char[charArray.length+1];
        for (int i = 0; i <charArray.length; i++)
        {
            newCharArray[i]=charArray[i];
        }
        newCharArray[newCharArray.length-1]=newElement3;

        return newCharArray;
    }
    public static String[] addNewString(String StringArray[], String newElement3)
    {
        String[] newStringArray = new String[StringArray.length+1];
        for (int i = 0; i <StringArray.length; i++)
        {
            newStringArray[i]=StringArray[i];
        }
        newStringArray[newStringArray.length-1]=newElement3;

        return newStringArray;
    }
}
