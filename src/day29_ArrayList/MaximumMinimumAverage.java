package day29_ArrayList;

import java.util.ArrayList;

public class MaximumMinimumAverage {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(7);
        int max = list.get(0);
        int min = list.get(0);
        double average =0;

        for (int i = 0; i <list.size() ; i++)
        {
            if(list.get(i)> max)
            {
                max = list.get(i);
            }
            else
            {
                min = list.get(i);
            }
            average+=list.get(i);
        }
        average = average / list.size();

        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
    }
}
