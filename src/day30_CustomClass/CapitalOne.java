package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CapitalOne {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setInfo("Gorkem",2232, 'M', "Software Tester", 7500, true);

        Employee employee2 = new Employee();
        employee2.setInfo("Berkem",234245, 'M', "Software Developer", 10000, true);

        Employee employee3 = new Employee();
        employee3.setInfo("Sian",22, 'F', "Manager", 5000, false);

        Employee employee4 = new Employee();
        employee4.setInfo("Tia",789, 'F', "Taxi Driver", 1800, false);

        Employee employee5 = new Employee();
        employee5.setInfo("Hülya",11, 'F', "Customer Service Representative", 1200, true);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};

       int partTime =0;
       int fullTime =0;
       double max = employee1.salary;
        double min = employee1.salary;

        for (Employee e : employees)
        {
            if(e.isFullTime)
            {
                fullTime++;
            }
            else
            {
                partTime++;
            }
            if(e.salary > max)
            {
                max = e.salary;
            }
            if(e.salary < min)
            {
                min = e.salary;
            }
        }

        System.out.println("part time " + partTime);
        System.out.println("full time " + fullTime);

        System.out.println("Max $" + max);
        System.out.println("Min $" + min);


    }
}
