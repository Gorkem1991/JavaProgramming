package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        //Maximum and minimum salary
        int maxSalary = Integer.MIN_VALUE;
        String name1 = "";

        int minSalary = Integer.MAX_VALUE;
        String name2 = "";

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet())
        {
            String eachKey = stringIntegerEntry.getKey();
            Integer eachValue = stringIntegerEntry.getValue();

            if(eachValue>maxSalary)
            {
             name1= eachKey;
             maxSalary=eachValue;
            }
            if(stringIntegerEntry.getValue()<minSalary)
            {
                minSalary = eachValue;
                name2 = eachKey;
            }
        }
        System.out.println(name1 + " " + maxSalary);
        System.out.println(name2 + " " + minSalary);

        //Number of employees that has salary between 120k and 150k
        int count =0;
        for (Integer value : map.values()) {
            if(value>120000 && value<150000)
            {
                count++;
            }
        }
        System.out.println(count);

        //Employee names who are making less than 118k
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet())
        {
            Integer salary = stringIntegerEntry.getValue();
            String name = stringIntegerEntry.getKey();

            if(salary<118000)
            {
                System.out.println(name);
            }
        }

        //increase salary of each employee by 10k if the salary is less than 120k

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet())
        {
            Integer value = stringIntegerEntry.getValue();
            if(value<120000)
            {
                value+=10000;
            }

            System.out.println(stringIntegerEntry.getKey() + " " + value);

        }



    }
}
