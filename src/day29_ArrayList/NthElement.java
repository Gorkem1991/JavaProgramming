package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthElement {
    public static void main(String[] args) {
        //Write a program that can return the nth largest number from an arraylist

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,8,8));
        int a = 2;
        ArrayList<Integer> numbers2= new ArrayList<>();

    for (int i =0 ; i<numbers.size(); i++)
    {
        if(!numbers2.contains(numbers.get(i)))
        {
            numbers2.add(numbers.get(i));
        }
    }


        for (int i = 0; i <a; i++)
        {

            int max = Collections.max(numbers2);
            numbers2.removeIf(p->Collections.max(numbers2)==p);
           // numbers2.remove(Integer.valueOf(max));
        }
        int newMax=Collections.max(numbers2);

        System.out.println(newMax);

    }
}
