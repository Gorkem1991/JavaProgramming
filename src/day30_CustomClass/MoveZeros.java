package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,3,4,0,2,0));

      int size = list.size();
      list.removeAll(Arrays.asList(0));
      int newSize = list.size();

      int totalNumberOfZeros = size - newSize;

        for (int i = 0; i <totalNumberOfZeros ; i++) {
            list.add(0);

        }
        System.out.println(list);

      /*  int counter =0;
        for (Integer integer : list)
        {
            if(integer ==0)
            {
                counter++;
            }
        }
        list.removeIf(p-> p==0);

        for (int i = 0; i < counter; i++) {
            list.add(0);
        }

        System.out.println(list);*/

    }
}
