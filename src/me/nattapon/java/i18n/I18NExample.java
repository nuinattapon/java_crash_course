package me.nattapon.java.i18n;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.*;

public class I18NExample {

    static void printDate(Locale locale){
        DateFormat formatter=DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
        Date currentDate=new Date();
        String date=formatter.format(currentDate);
        System.out.println(date+" "+locale);
    }

    static void printTime(Locale locale){
        DateFormat formatter=DateFormat.getTimeInstance(DateFormat.DEFAULT,locale);
        Date currentDate=new Date();
        String time=formatter.format(currentDate);
        System.out.println(time+" in locale "+locale);
    }

    static void printCurrency(Locale locale){
        double dbl=10500.3245;
        NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);
        String currency=formatter.format(dbl);
        System.out.println(currency+" for the locale "+locale);
    }

    static void printNumber(Locale locale){
        double dbl=105000.3245;
        NumberFormat formatter=NumberFormat.getNumberInstance(locale);
        String number=formatter.format(dbl);
        System.out.println(number+" for the locale "+locale);
    }

    public static void main(String[] args) {
        System.out.println("<------ Date ------>");
        printDate(Locale.UK);
        printDate(Locale.US);
        printDate(Locale.FRANCE);
        printDate(Locale.GERMANY);
        printDate(Locale.JAPAN);
        printDate(new Locale("th","TH"));

        System.out.println("<------ Time ------>");
        printTime(Locale.UK);
        printTime(Locale.US);
        printTime(Locale.FRANCE);
        printTime(Locale.GERMANY);
        printTime(Locale.JAPAN);
        printTime(new Locale("th","TH"));

        System.out.println("<---- Currency ---->");
        printCurrency(Locale.UK);
        printCurrency(Locale.US);
        printCurrency(Locale.FRANCE);
        printCurrency(Locale.GERMANY);
        printCurrency(Locale.JAPAN);
        printCurrency(new Locale("th","TH"));

        System.out.println("<----- Number ----->");
        printNumber(Locale.UK);
        printNumber(Locale.US);
        printNumber(Locale.FRANCE);
        printNumber(Locale.GERMANY);
        printNumber(Locale.JAPAN);
        printNumber(new Locale("th","TH"));
    }
}