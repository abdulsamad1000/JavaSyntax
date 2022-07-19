package com.syntax.Class28;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("Mango");
        fruit.add("Water Melon");
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Straberry");
        fruit.add("Peach");
        fruit.add("Water Melon");
        fruit.add("Mango");
        System.out.println(fruit);
    }
}
