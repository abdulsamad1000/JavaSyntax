package com.syntax.PracticeClass;

import java.util.LinkedHashMap;

public class LinkedhadMapPracitice {
    public static void main(String[] args) {
        /**
         * /*Create a map of a building. Store floor number and its associated company name.
         * (Example: 1= Google, 2=Syntax etc.).
         * Insert 7 entries with duplicate keys and values.
         * - Check how many entries you have?
         * - Update company on a 4th floor
         * - Remove company on the 5th floor
         * - Print your map */
        LinkedHashMap<Integer,String> buildingMap= new LinkedHashMap<>();
        buildingMap.put(1,"Google");
        buildingMap.put(2,"Syntax");
        buildingMap.put(3,"Facebook");
        buildingMap.put(4,"Amazon");
        buildingMap.put(5,"Oracle");
        buildingMap.put(1,"Google");
        buildingMap.put(4,"Microsoft");
        System.out.println(buildingMap);
        System.out.println(buildingMap.size());
        buildingMap.replace(4,"Youtub");
        System.out.println(buildingMap);
        buildingMap.remove(4);
        System.out.println(buildingMap);
    }
}
