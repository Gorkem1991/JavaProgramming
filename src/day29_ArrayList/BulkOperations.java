package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        // argument must be a collection type
        /*
        addAll(collectionType)
        removeAll(collectionType)
        retainAll(collectionType)
        containsAll(collectionType)
        */

        ArrayList<Integer> list = new ArrayList<>();

        //asList(array of values) will be converted to collection type

       list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list);

        System.out.println("--------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));

        numbers.retainAll(Arrays.asList(100,200,300));
        System.out.println(numbers);

        System.out.println("--------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","SDET","DEveloper","QA","SDET","ScrumMaster","BA","BA"));

        jobTitles.retainAll(Arrays.asList("QA","SDET"));

        System.out.println(jobTitles);

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1 = nums.contains(10);

        boolean r2 = nums.containsAll(Arrays.asList(10,9));

        System.out.println(r2);

        System.out.println("-------------------------");

        String[] names = {"Josh","Jack","Daniel","Shay","Breanna"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        //namesList.addAll(Arrays.asList(names));

        System.out.println(namesList);


        System.out.println("---------------------");

        Integer[]arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        int[]arr2 = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list3 = new ArrayList<>(cnvertArraytoArrayList(arr2));



    }


    public static ArrayList<Integer> cnvertArraytoArrayList(int[] array)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array)
        {
            list.add(each);
        }
        return list;

    }
}
