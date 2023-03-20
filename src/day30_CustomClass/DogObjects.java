package day30_CustomClass;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DogObjects  {
    public static void main(String[] args)
    {
        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed="Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        Dog dog2 = new Dog();

        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";


        Dog dog3 = new Dog();
        dog3.setInfo("Jack","German Shepard",2, 'M',"Large", "Black");

        Dog dog4 = new Dog();
        dog4.setInfo("Mike","Doberman",3, 'F',"Small", "Black");

        Dog dog5 = new Dog();
        dog5.setInfo("Sun","Rottweiler",1, 'M',"Large", "Brown");

        Dog[] dogs = {dog1,dog2,dog3,dog4,dog5};

/*

        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));

        femaleDogs.removeIf(p-> p.gender =='M');
        maleDogs.removeIf(p-> p.gender =='F');

       int female = Collections.frequency(femaleDogs, 'F');
       int male = Collections.frequency(maleDogs, 'M');

        System.out.println(female);
        System.out.println(male);*/


    }



}
