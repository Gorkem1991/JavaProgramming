package practice;

import java.util.ArrayList;
import java.util.List;

public class maxFreq {
    public static void main(String[] args) {


        int[] arr = {1,2,2,2,2,2,2,3,3,3,3,3,3,4,5,6,6,6,6,6,6};
ArrayList<Integer> highestFreq = new ArrayList<>();

        int number =0;

        for (int i = 0; i < arr.length; i++)
        {
            int freq =0;
            for (int j = 0; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    freq++;
                }
                if(freq>number)
                {
                    number=freq;
                }
            }

        }

        for (int each: arr)
        {
            int freq = 0;
            for (int each2: arr)
            {
                if(each==each2)
                {
                    freq++;
                }
            }
            if(freq==number && !highestFreq.contains(each))
                {
                    highestFreq.add(each);
                }
        }
        System.out.println(highestFreq);
    }
}
