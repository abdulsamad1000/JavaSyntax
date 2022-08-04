package com.syntax.PracticeClass;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {
        /**
         *     Create a map of countries with its capital that will store countries in alphabetical order.
         * Print all keys and values from a country map using for each loop and iterator.
         * Print all values from a country map using for each loop and iterator.
         */
        TreeMap<String, String> CountriesAndCapital= new TreeMap<>();
        CountriesAndCapital.put("Afghanistan","Kabul");
        CountriesAndCapital.put("USA","Washintown Dc");
        CountriesAndCapital.put("China","Hokong");
        CountriesAndCapital.put("Germany","Hamburg");
        CountriesAndCapital.put("France","Paris");
       for (Map.Entry<String, String> entry: CountriesAndCapital.entrySet()){
           System.out.println("Country is " + entry.getKey()+" And "+" Capital is " +entry.getValue());
           
       }

    }
}
