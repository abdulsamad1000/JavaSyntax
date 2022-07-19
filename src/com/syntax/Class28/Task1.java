package com.syntax.Class28;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        /**
         * Create an ArrayList that will store 5 names into it.
         * Find out whether the given ArrayList is empty or not?
         * Check whether the specific name is present in an ArrayList or not?
         * Find the size of your arrayList and print all values from that
         */
        ArrayList<String> Names=new ArrayList<>();
        Names.add("Bob");
        Names.add("Mike");
        Names.add("Johon");
        Names.add("Rubert");
        Names.add("James");
        System.out.println(Names.isEmpty());
        System.out.println(Names.contains("Mike"));
        System.out.println(Names.size());
        System.out.println(Names);
    }
}
