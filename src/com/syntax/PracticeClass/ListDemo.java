package com.syntax.PracticeClass;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Bilal");
        names.add("Jalal");
        names.add("Kamal");
        names.add("Arif");
        names.add("Zameer");

        Iterator<String> iterator= names.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());

        while (iterator.hasNext()){
            if (iterator.next().endsWith("l")){
                iterator.remove();
            }
        }
        System.out.println(names);

    }
}
