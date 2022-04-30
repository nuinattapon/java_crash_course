
package me.nattapon.java.advanced.fileexample;

import java.io.File;
import java.io.IOException;


public class FileCreationExample {

    public static void main(String[] args) {
        
        File myFile = new File(".\\myFile.txt");
        try {
            boolean fileCreated = myFile.createNewFile();
            System.out.println(fileCreated);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
    
}