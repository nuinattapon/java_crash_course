package me.nattapon.java.example;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedTime {
    public static void main(String[] args) {
        ZoneId sg = ZoneId.of("Asia/Singapore");
        ZoneId th = ZoneId.of("Asia/Bangkok");
        ZoneId sfo = ZoneId.of("America/Los_Angeles");

        ZonedDateTime thTime =  ZonedDateTime.now();
        ZoneId th2 = thTime.getZone();
        System.out.println(th);
        System.out.println(th2);
        System.out.println(thTime);
        ZonedDateTime sgTime = thTime.withZoneSameInstant(sg);
        System.out.println(sgTime);
        ZonedDateTime sfoTime = thTime.withZoneSameInstant(sfo);
        System.out.println(sfoTime);

        LocalDateTime thLocaltime = thTime.toLocalDateTime();
        System.out.println(thLocaltime);
    }
}
