package me.nattapon.java.example;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("Hello");

        System.out.println("empty = " + optional);

        Supplier<String> stringSupplier = () -> {
            // Extra computational to retrieve the value
            return "WORLD";
        };
        String orElse = optional.map(String::toUpperCase)
                                .orElseGet(stringSupplier);

        System.out.println("orElse = " + orElse);
    }
}
