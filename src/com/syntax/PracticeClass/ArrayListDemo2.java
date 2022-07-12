package com.syntax.PracticeClass;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Ahamd");
        names.add("Zameer");
        names.add("Jason");
        names.add("Kelven");
        names.add("Abdul");
        System.out.println(names);
        names.remove("Jason");
        System.out.println(names);
        names.add("Mike");
        System.out.println(names);
        names.remove(2);
        System.out.println(names);

    }
}
