package me.nattapon.java.example;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String str = "Optional";
        Optional<String> optional = Optional.ofNullable("Optional");

        System.out.printf("opt.isEmpty() = %b\n\n", optional.isEmpty());

        if (optional.isPresent()) {  // It Checks, value is present or not
            System.out.println(optional.get());
        } else
            System.out.println("Value is not present");

        // Declarative approach
        optional.ifPresentOrElse(System.out::println,
            () -> {
                System.out.println("Value is not present");
            }
        );
    }
}