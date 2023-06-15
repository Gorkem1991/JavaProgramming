package practice;

import java.util.Arrays;

public class ShiftZeros {
    public static void main(String[] args) {
        int [] num ={1,0,7,0,5,7,2,0,8,0};

        int[] result = new int[num.length];

        int j =0;
        for (int i = 0; i <num.length; i++)
        {
            if(num[i]!=0)
            {
                result[j] = num[i];
                j++;
            }

        }

        System.out.println(Arrays.toString(result));
    }
}
