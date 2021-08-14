package me.nattapon.java.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18NDemo {
    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", Locale.US);
        System.out.println("Message in " + Locale.US + ":" + bundle.getString("greeting"));

        //changing the default locale to Thailand
        Locale.setDefault(new Locale("th", "TH"));
        bundle = ResourceBundle.getBundle("MessageBundle");
        System.out.println("Message in " + Locale.getDefault() + ":" + bundle.getString("greeting"));

    }
}