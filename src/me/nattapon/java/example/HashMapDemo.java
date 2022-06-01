package me.nattapon.java.example;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();//Creating HashMap
        map.put(1, "Mangoes");  //Put elements in Map
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");

        map.putIfAbsent(1,"Mango");

        System.out.println("Iterating Hashmap...");
        for(int key : map.keySet()) {
            System.out.printf("Key %2d : Value %s\n", key, map.get(key));
        }
        System.out.println();
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println();
        System.out.println("Using stream() with Hashmap...");
        map.entrySet().forEach((m)-> {
            System.out.println(m.getKey() + " " + m.getValue());
        });
        System.out.println();
        System.out.println("Using forEach() with Hashmap...");
        map.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println();
        System.out.printf("Key %2d : Value %s\n", 5, map.get(5));

    }

}
