package me.nattapon.java.example;


public class DateType {
    public static void main(String... args) {
        // https://www.javatpoint.com/java-get-current-date
        System.out.println(java.time.LocalDate.now());
        System.out.println(java.time.LocalTime.now());
        System.out.println(java.time.LocalDateTime.now());
        System.out.println(java.time.Clock.systemUTC().instant());

        long millis = System.currentTimeMillis();
        java.util.Date date = new java.util.Date(millis);
        System.out.println(date);

        millis = System.currentTimeMillis();
        java.sql.Date sqlDate = new java.sql.Date(millis);
        System.out.println(sqlDate);

        System.out.println(java.time.OffsetDateTime.now());
    }
}