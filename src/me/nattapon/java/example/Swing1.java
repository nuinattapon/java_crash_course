package me.nattapon.java.example;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Swing1 {
 public static void main(String[] args) {
     JFrame frame = new JFrame();
     frame.setTitle("JFrame title goes here");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     ImageIcon image = new ImageIcon("oracle.ico");
     frame.setResizable(false);
    //  frame.setIconImage(image.getImage());
     frame.setSize(420,420);
     frame.getContentPane().setBackground(new Color(0x497443));
     
     frame.setVisible(true);
    }   
}
