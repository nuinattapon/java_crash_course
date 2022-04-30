
package me.nattapon.java.advanced.hashmapexample;

import java.util.HashMap;

/**
 *
 * @author bethan
 */
public class HashMapExample {
    
    public static void main(String[] args) {  
        
        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 98765);
        phonebook.put("Brenda", 123123);
        phonebook.put("Brenda", 22222);
        phonebook.put(null, 000);
        Integer result = phonebook.putIfAbsent("Kevin",54321);
        System.out.println(result);
        System.out.println(phonebook);
        if(phonebook.containsKey("Brenda")) {
            phonebook.remove("Brenda");
        }
        System.out.println(phonebook);
        phonebook.clear();
        System.out.println(phonebook);
               
        
    }
        

    
}
