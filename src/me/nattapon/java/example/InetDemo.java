package me.nattapon.java.example;

import java.net.InetAddress;

public class InetDemo {
    public static void main(String[] args) {
        try {
            InetAddress localIp = InetAddress.getLocalHost();
            System.out.println("Your current Hostname : " + localIp.getHostName());
            System.out.println("Your current IP address : " + localIp.getHostAddress());
            System.out.println("IP Loopback Address: " + InetAddress.getLoopbackAddress().getHostAddress());

            InetAddress ip = InetAddress.getByName("nattapon.me");
            System.out.println("\nHost Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}