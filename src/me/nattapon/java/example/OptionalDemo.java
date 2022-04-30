package me.nattapon.java.example;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> empty = Optional.ofNullable("Hello");
        System.out.println("empty = " + empty);
        System.out.println(empty.isEmpty());
        System.out.println(empty.isPresent());

        String orElse = empty
                .map(String::toUpperCase)
                .orElseGet(
                    ()-> {
                        // Extra computational to retrieve the value
                        return "WORLD";
                    });

        System.out.println("orElse = " + orElse);
    }
}
