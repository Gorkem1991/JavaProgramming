package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListsMethod2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);
        // if it is a primitive type of data it will remove the value in that index
        int num = 1;
        list.remove(num);

        // if it is a non primitive type, it will remove the object
        Integer num2 = 200;
        list.remove(num);

        System.out.println(list);

        System.out.println("-------------------------------");

        //remove all the elements of the arraylist
        list.clear();

        System.out.println(list);

        System.out.println("---------------------");
        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');
        int b = characters.lastIndexOf('A');

        System.out.println(a);
        System.out.println(b);

        System.out.println("--------------------------");
        boolean r2 = characters.contains('A');
        boolean r3 = characters.contains('Z');

        System.out.println(r2);
        System.out.println(r3);

        System.out.println("----------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);


        System.out.println(list1 == list2);

        //returns true if the arraylists are equals
        System.out.println(list1.equals(list2));

        //clears the list
        list1.clear();
        boolean r4 = list1.isEmpty();

        System.out.println(r4);

        ArrayList<Integer> number = new ArrayList<>();

        number.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(number);




    }
}
