package me.nattapon.java.example;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";// Setting value for 5th index
        Optional<String> opt = Optional.ofNullable(str[5]);
        if (opt.isPresent()) {  // It Checks, value is present or not
            String lowercaseString = str[5].toLowerCase();
            System.out.println(lowercaseString);
        } else
            System.out.println("String value is not present");

        System.out.printf("opt.isEmpty() = %b",opt.isEmpty());
    }
}