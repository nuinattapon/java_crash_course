package me.nattapon.java.example;

import java.util.Iterator;
import java.util.LinkedList;

// https://www.javatpoint.com/collections-in-java

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.printf("List size = %d\n",al.size());
        al.clear();
        System.out.printf("List size = %d after list.clear()\n",al.size());
    }
}
