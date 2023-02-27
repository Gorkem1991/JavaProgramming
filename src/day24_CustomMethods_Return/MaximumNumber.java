package day24_CustomMethods_Return;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumNumber {
    public static void main(String[] args) {

        int[] myNumbers ={2,6,3,7,8,3,4,5,10,60,34,12,54,63,78};
        int maxNo = myNumbers[0];
        System.out.println(maximumNumber(myNumbers, maxNo));
    }
    public static int maximumNumber(int[] myNumbers, int maxNo)
    {

        for (int i =0; i<myNumbers.length; i++)
        {
            if(myNumbers[i]>maxNo)
            {
                maxNo=myNumbers[i];
            }
        }
        return maxNo;
    }
}
