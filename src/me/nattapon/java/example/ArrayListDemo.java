package me.nattapon.java.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// https://www.javatpoint.com/collections-in-java

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Peter");
        list.add(1,"Sam");
        list.add("Ajay");

        list.forEach(System.out::println);
        System.out.println();

        list.set(3,"John");

        list.forEach(System.out::println);
        System.out.println();

        list.remove(2);
        //Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();
        System.out.printf("List size = %d\n", list.size());
        list.clear();
        System.out.printf("List size = %d after list.clear()\n", list.size());

    }
}