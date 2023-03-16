package day29_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FirstUniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++)
        {
            int count =0;
            for (int j = 0; j < list.size(); j++)
            {
                if(list.get(i) == list.get(j))
                {
                    count++;
                }
            }
            if(count ==1)
            {
                list2.add(list.get(i));
                break;
            }

        }
        System.out.println(list2);
    }
}
