package com.syntax.PracticeClass;

import java.util.ArrayList;

public class ArrayListHW1 {
    /**
     *Create an an ArrayList that will store 5 names into it. find out whether the given ArrayList is empty or not
     * Check whether the specific name is present in an ArrayList or not
     * Find the size of your Arraylist and print all values from that.
     */
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Mike");
        names.add("Jef");
        names.add("Rocky");
        names.add("John");
        names.add("Nicky");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Jef"));
        System.out.println(names.size());
        System.out.println("names = " + names);
    }
}
