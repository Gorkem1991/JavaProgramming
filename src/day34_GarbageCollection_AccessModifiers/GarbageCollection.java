package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day32_Constructor.Car;
import day33_Statics.Iphone;
import day33_Statics.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        str =null;
        System.out.println(str);

       Dog dog1 = new Dog();
       dog1.name = "Lucy";

        dog1 = new Dog();
        dog1.name = "Max";

        System.out.println(dog1);

        String language = "Python"; // unreferenced, so it will be eligible to garbage collection.
               language ="Java";

        System.out.println(language);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        ArrayList<Integer> list2 = list1; //list 1 object is assigned to list2, they use the same object thats why they have same values
        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1==list2);

        System.out.println("-----------------------------------");

        Student student1 = new Student("Tahir",'M',30,14,'B');
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);


        System.out.println("------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("java");
        ArrayList<String> l2 = l1; // here they reference to the same object thats why result is the same.
                                    // WE dont use new ArrayList<> so it is not a new object
        l1.add("Python");

        System.out.println("l1 =" + l1);
        System.out.println("l2 =" + l2);

    }
}
