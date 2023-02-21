package day21_ForEachLoop;

import java.util.Arrays;

public class Concat2Arrays {
    public static void main(String[] args) {

      String[] group1={"Ali","Layan","Aysenur"};
      String[] group2={"Maria","Aygun","Duygu","Valeriy"};

        String[]arr3 = new String[group1.length+group2.length];

        int i=0;

        for (String each : group1)
        {
            arr3[i++] = each;
        }
        for (String each : group2) {
            arr3[i++] = each;
        }

       /* int [] arr1 = {1,2,3,4};
        int [] arr2 = {5,6};



        int[]arr3 = new int[arr1.length+arr2.length];

        for (int i = 0; i <arr1.length; i++)
        {
                arr3[i] = arr1[i];
        }
        for (int i = 0,j=arr1.length; i <arr2.length; i++,j++)
        {
            arr3[j] = arr2[i];
        }*/
        System.out.println(Arrays.toString(arr3));



    }
}
