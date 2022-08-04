package com.syntax.PracticeClass;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class PracticeToAddToClass {
    public static void main(String[] args) {
        TreeMap<String,Integer> fruit=new TreeMap<>();
        fruit.put("Mango",22);
        fruit.put("Water Melon",25);
        fruit.put("Banana",28);
        fruit.put("Apple",29);

        HashMap<String,Integer> juice = new HashMap<>();
        juice.put("Strabeery",10);
        juice.put("Avacado",9);
        juice.put("Grape",11);
        juice.put("Mango",15);
        juice.put("Kiwi",8);

        LinkedHashMap<String, Integer> MixFruitAndJuice=new LinkedHashMap<>();
        MixFruitAndJuice.putAll(fruit);
        MixFruitAndJuice.putAll(juice);
        System.out.println(MixFruitAndJuice);

    }
}
