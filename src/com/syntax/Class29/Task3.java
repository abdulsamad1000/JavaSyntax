package com.syntax.Class29;

import java.util.LinkedHashSet;

public class Task3 {
    public static void main(String[] args) {
        /**
         * Create a Set of cities in which you want to make sure that
         * insertion order is maintained. Then remove any city that starts with “A”;
         */
        LinkedHashSet<String> Cities=new LinkedHashSet<>();
        Cities.add("Kabul");
        Cities.add("Austin");
        Cities.add("Ghazni");
        Cities.add("Bameyan");
        Cities.add("Herat");
        Cities.add("Noristan");
        System.out.println(Cities);
        System.out.println("********************************************************");

        Cities.removeIf(City->City.startsWith("A"));
        System.out.println(Cities);

    }
}
