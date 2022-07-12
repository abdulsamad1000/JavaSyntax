package com.syntax.PracticeClass;

import java.util.ArrayList;

public class ArrayListHW4 {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Apple");
        drinks.add("EasteBunny");
        drinks.add("Cocola");
        for (int i=0; i<drinks.size(); i++){
            if(drinks.get(i).contains("a") ||drinks.get(i).contains("e")){
                drinks.remove(i);
                drinks.add("water");
               }
            }
        System.out.println(drinks);
        }
    }

