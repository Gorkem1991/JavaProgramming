package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        for (int[] each1DArray: arr2D)
        {
           for(int eachElement:each1DArray)
           {
               System.out.println(eachElement);
           }
        }

        int[][][] arr3D = {{{1,2,3},{4,5,6,7},{8,9,10,11,12}},{{10,20,30},{40,50,60,70},{80,90,100,110,120}}};

        for (int[][] ints : arr3D) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.println(i);
                }
            }
        }

        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[1][1]));
        System.out.println(arr3D[1][1][1]);

        int[][][][] arr4D = { {{{1,2,3},{4,5,6,7},{8,9,10,11,12}},{{10,20,30},{40,50,60,70},{80,90,100,110,120}}} };

        for (int[][][] ints : arr4D) {
            for (int[][] anInt : ints) {
                for (int[] ints1 : anInt) {
                    for (int i : ints1) {
                        System.out.println(i);
                    }

                }

            }

        }

    }
}
