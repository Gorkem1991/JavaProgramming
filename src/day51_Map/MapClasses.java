package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(10,"Ronnie");
        hashMap.put(20,"George");
        hashMap.put(30,"Arthur");
        hashMap.put(40,"Jack");
        hashMap.put(50,"Emma");
        hashMap.put(60,"Isabella");
        hashMap.put(60,"Mark");
        hashMap.put(60,"Ahmet");

        System.out.println(hashMap);

        Map<Integer,String> linkedHasMap = new LinkedHashMap<>();
        linkedHasMap.put(10,"Arthur");
        linkedHasMap.put(20,"George");
        linkedHasMap.put(3,"Jack");
        linkedHasMap.put(40,"Emma");
        linkedHasMap.put(5,"Ahmet");
        linkedHasMap.put(5,"Isabella");
        linkedHasMap.put(null,"Hulya");

        System.out.println(linkedHasMap);


        Map<Integer,String> treeMap = new TreeMap<>(); // Key can not be null, value can be null and duplicated
        treeMap.put(10,"Arthur");
        treeMap.put(20,"George");
        treeMap.put(3,"Jack");
        treeMap.put(40,"Emma");
        treeMap.put(5,"Ahmet");
        treeMap.put(5,"Isabella");

        System.out.println(treeMap);

        Map<Integer,String> hashtable = new Hashtable<>(); // key and value both can not null
        hashtable.put(10,"Arthur");
        hashtable.put(20,"George");
        hashtable.put(3,"Jack");
        hashtable.put(40,"Emma");
        hashtable.put(5,"Ahmet");
        hashtable.put(5,"Isabella");




    }
}
