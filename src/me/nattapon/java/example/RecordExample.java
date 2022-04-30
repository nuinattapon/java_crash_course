package me.nattapon.java.example;

import java.math.BigDecimal;

public class RecordExample {
    public static void main(String[] args) {
        Employee alex = new Employee("Alex", new BigDecimal("100000"));
        System.out.println(alex);
    }
}
