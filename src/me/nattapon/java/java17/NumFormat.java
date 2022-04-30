package me.nattapon.java.java17;

import java.text.NumberFormat;
import java.util.Locale;

public class NumFormat {
    public static void main(String[] args) {
        Locale locale=new Locale("th","TH");//for the specific locale

        NumberFormat f = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.SHORT);
        String result = f.format(1234567);
        System.out.println(result);

        NumberFormat g = NumberFormat.getCurrencyInstance(locale);
        String value = g.format(-2.99);
        System.out.println(value);

    }
}
