
package me.nattapon.java.advanced.linkedlistexample;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author bethan
 */
public class LinkedListExample {
    
    
    public static void main(String[] args) {
        
        List<String> myList = new LinkedList();
        myList.add("A");
        myList.add("B");
        myList.add(1, "C");
        myList.add("D");
        System.out.println(myList);
        myList.remove("B");
        System.out.println(myList);
        myList.remove(0);
        System.out.println(myList);

    }

    
}
