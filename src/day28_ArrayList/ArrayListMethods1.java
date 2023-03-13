package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        //adds element to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);

        // adds element to the specific index
        numbers.add(2,25);
        numbers.add(5,45);

        //gets the element that is specified.
        Integer num = numbers.get(3);
        System.out.println(num);

        // returns the total number of elements.
        System.out.println(numbers.size());

        System.out.println("-----------------");

        for (int i = 0; i <numbers.size() ; i++) {
            System.out.println(numbers.get(i));

        }
        System.out.println("-----------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2,"Javascript");

        list.set(3,"C++");
        System.out.println(list);


    }
}
