package me.nattapon.java.functional;

public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
