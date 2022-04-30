package me.nattapon.java.functional;
import java.util.function.Function;
import java.util.function.BiFunction;

public class Chapter2Video8 {

    public static void main(String[] args) {
        BiFunction<Float, Float, Float> divide = (x, y) -> x / y;

        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondArgIsntZeroCheck =
                (func) -> (x, y) -> {
                    if (y == 0f) {
                        System.out.println("Error: second argument is zero!");
                        return Float.MAX_VALUE;
                    }
                    return func.apply(x, y);
                };

        BiFunction<Float, Float, Float> divideSafe = secondArgIsntZeroCheck.apply(divide);

        System.out.println(divideSafe.apply(10f, 0f));
    }
}
