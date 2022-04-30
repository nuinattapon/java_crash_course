package me.nattapon.java.example;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit> {
    public int id;

    public Fruit(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String name;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double price;

    @Override
    public String toString() {
        return "Fruit {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Fruit o) {
        return (int) (this.price - o.price);
    }

    public static Comparator<Fruit> NAME_COMPARATOR = Comparator.comparing(Fruit::getName);
    public static Comparator<Fruit> PRICE_COMPARATOR = Comparator.comparing(Fruit::getPrice);

}
