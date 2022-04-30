package me.nattapon.java.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<>();
        gamesList.add("Cricket");
        gamesList.add("Football");
        gamesList.add("Chess");
        gamesList.add("Hocky");
        gamesList.add("Canoeing");

        gamesList.forEach(System.out::println);

        System.out.println();

        List<String> cGamesList = gamesList.stream()
                .filter(s -> s.startsWith("C"))
                .map(s -> s.toUpperCase())
                .toList();

        cGamesList.forEach((game)-> {
            System.out.printf("%-10s\n",game);
        });

        System.out.println();
        System.out.println(gamesList.get(gamesList.size() - 1));

    }
}