
package me.nattapon.java.advanced.wildcards;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bethan
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        // List of buildings
        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Building());
        printBuildings(buildings);
        
        // List of offices
        List<Office> offices = new ArrayList();
        offices.add(new Office());
        offices.add(new Office());
        printBuildings(offices);

        // List of houses
        List<House> houses = new ArrayList();
        houses.add(new House());
        houses.add(new House());
        printBuildings(houses);
        
        addHouseToList(houses);
        addHouseToList(buildings);        
        
    }

    
    static void printBuildings(@NotNull List<? extends Building> buildings) {
        for(int i = 0; i < buildings.size(); i++) {
            System.out.println(buildings.get(i).toString() + " " + (i + 1));
        }
        System.out.println();
    }
    
    
    static void addHouseToList(@NotNull List<? super House> buildings) {
        buildings.add(new House());
        System.out.println();
    }
    
    
}
