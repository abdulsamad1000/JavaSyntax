package com.syntax.Class29;

import java.util.Iterator;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        /**
         * Create a Set collection in which you need to add names of the
         * countries. In this set we want all objects to be sorted in
         * alphabetical order. Using 2 different ways retrieve all elements from set.
         */
        TreeSet<String> Countries = new TreeSet<>();
        Countries.add("Afghanistan");
        Countries.add("Germany");
        Countries.add("Honkan");
        Countries.add("Brazel");
        Countries.add("Iraq");
        Countries.add("Franch");
        Countries.add("Pakistan");
        Countries.add("Columbia");
        System.out.println(Countries);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
       Iterator<String> iterator=Countries.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
    }
}
