package me.nattapon.java.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Chapter3Video1 {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));
        listOfIntegers.add(11);

        Function<Integer, Double> timesTwo = (x) -> x * 2.0;

        List<Double> doubled = listOfIntegers
                .stream()
                .map(timesTwo)
                .collect(Collectors.toList());
        doubled.add(timesTwo.apply(12));
        System.out.println(doubled);
    }
}
