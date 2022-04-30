package me.nattapon.java.advanced.varargs;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Varargs {
    public Varargs() {
    }

    public static void main(String[] args) {
        String imem1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";
        printShoppingList(imem1, item2, item3);
        printShoppingList("Bread", "Milk", "Eggs", "Bananas");
    }

    private static void printShoppingList(String... items) {
        System.out.println("SHOPPING LIST");

        for(int i = 0; i < items.length; ++i) {
            System.out.println(i + 1 + ": " + items[i]);
        }

        System.out.println();
    }
}
