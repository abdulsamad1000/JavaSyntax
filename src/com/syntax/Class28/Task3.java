package com.syntax.Class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
    public static void main(String[] args) {
        /**
         * Create an arrayList of words. Remove every word that ends with “e”.
         */
        ArrayList<String> words=new ArrayList<>();
        words.add("orange");
        words.add("people");
        words.add("jame");
        words.add("straberry");
        words.add("banana");
        for (int i=0; i<words.size(); i++){
            if (words.get(i).contains("e")){
                words.remove(i);
            }
            System.out.println(words);
        }
    }
}
