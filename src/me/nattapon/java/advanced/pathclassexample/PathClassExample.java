/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.nattapon.java.advanced.pathclassexample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Bethan Palmer
 */
public class PathClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] contents = new File(".").list();
        for(String file: contents) {
            System.out.println(file);
        }
        System.out.println();

        Path path = Paths.get("Hello World.txt");
        try {
            Files.deleteIfExists(path);
        } catch (IOException ex) {
           ex.printStackTrace();
        }
        
        Path path2 = Paths.get("./example.txt");
        System.out.println(path2.getParent());
        System.out.println(path2.getRoot());
        System.out.println(path2.getFileName());
      
    }
    
}
