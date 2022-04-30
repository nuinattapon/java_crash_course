package me.nattapon.java.example;

import java.util.*;

import static java.util.Comparator.comparing;

public class SetDemo {
    public static void main(String[] args) {
        Set<Fruit> s = new HashSet<>();

        Fruit banana=new Fruit(1,"Banana",12.12);
        Fruit papaya=new Fruit(1,"Papaya",23.43);
        Fruit orange=new Fruit(1,"Orange",45.86);
        Fruit pomelo=new Fruit(1,"Pomelo",53.62);

        s.add(pomelo);
        s.add(papaya);
        s.add(orange);
        s.add(banana);

        s.add(banana);
        System.out.println("Fruits in Set");
        s.forEach(System.out::println);
        System.out.println();

        List<Fruit> fruitArrayList = new ArrayList<>(s);
        System.out.println("Fruits in ArrayList sorted by price descending");
        fruitArrayList.sort(Fruit.PRICE_COMPARATOR.reversed());
        fruitArrayList.forEach(System.out::println);
        System.out.println();

        System.out.println("Fruits in ArrayList sorted by price ascending");
        Collections.sort(fruitArrayList);
        fruitArrayList.forEach(System.out::println);
        System.out.println();

        System.out.println("Fruits in ArrayList sorted by fruit name");
        Collections.sort(fruitArrayList,Fruit.NAME_COMPARATOR);
        fruitArrayList.forEach(System.out::println);
        System.out.println();
    }
}
