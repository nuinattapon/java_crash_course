package me.nattapon.java.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();//Creating HashMap
        map.put(1, "Mango");  //Put elements in Map
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");

        System.out.println("Iterating Hashmap...");
        for(int key : map.keySet()) {
            System.out.printf("Key %2d : Value %s\n", key, map.get(key));
        }
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.printf("Key %2d : Value %s\n", 5, map.get(5));
        System.out.println(map.get(5) == null);

    }

}
