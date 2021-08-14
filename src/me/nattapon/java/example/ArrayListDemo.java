package me.nattapon.java.example;

import java.util.ArrayList;
import java.util.Iterator;

// https://www.javatpoint.com/collections-in-java

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Peter");
        list.add("Ajay");
        list.set(3,"John");
        list.remove(2);
        //Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.printf("List size = %d\n", list.size());
        list.clear();
        System.out.printf("List size = %d after list.clear()\n", list.size());

    }
}