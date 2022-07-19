package com.syntax.Class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo8 {
    public static void main(String[] args) {
        //how can we remove the elements from a map bases on the values
        HashMap<String, Double> fruits = new HashMap<>();
        fruits.put("Apple",2000.0); // auto upcasting does not work with wrappers
        fruits.put("Orange",20.5);
        fruits.put("Kiwi",10.2);
        fruits.put("Banana",10.2);
        fruits.put("Peach",10.5);
        // method chaining getting directly Iterator
        Iterator<Map.Entry<String,Double>> iterator = fruits.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,Double> en = iterator.next();
            if (en.getKey().contains("e") && en.getValue()>15) {
                iterator.remove();
            }
        }
        System.out.println(fruits);
    }
}
