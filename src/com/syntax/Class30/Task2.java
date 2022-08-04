package com.syntax.Class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {


        /**
         *     Create a map of countries with its capital that will store countries in alphabetical order.
         * Print all keys and values from a country map using for each loop and iterator.
         * Print all values from a country map using for each loop and iterator.
         */
        TreeMap<String, String> countryCapitalMap= new TreeMap<>();
        countryCapitalMap.put("Turkey","Ankara");
        countryCapitalMap.put("Azerbahijan","Baku");
        countryCapitalMap.put("Azerbahijan","Baku");
        countryCapitalMap.put("Pakistan","Islamabad");
        countryCapitalMap.put("Kazakistan","Astana");
        for (Map.Entry<String, String> entry:countryCapitalMap.entrySet()){
            System.out.println("entry key =" +entry.getKey()+"entry value ="+entry.getValue());

        }
        System.out.println("***********************************************************************************");

       Iterator<Map.Entry<String,String>> iterator= countryCapitalMap.entrySet().iterator();
       while (iterator.hasNext()){
           Map.Entry<String, String> entry=iterator.next();
          // System.out.println("entery.getkey()= "+entry.getKey()+" value "+entry.getValue());
           // NOTE: the line number 30 we can do it in short way as i see it in line 32
           System.out.println("entry key = " + entry);
       }
        System.out.println("****************************************************************************************");
       Collection<String> values=countryCapitalMap.values();
       for (String country:values){
           System.out.println("country = "+ country);
       }

       System.out.println("****************************************************************");
        Iterator<String> iter= countryCapitalMap.values().iterator();
        while (iter.hasNext()){
            System.out.println("Capitals = " + iter.next());
        }

    }
}
