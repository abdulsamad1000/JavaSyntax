package com.syntax.PracticeClass;

import java.util.ArrayList;

public class ArrayListHW3 {
    public static void main(String[] args) {
        /**
         * Create an ArrayList of words. remove every word that ends with "e"
         */
        ArrayList<String> words=new ArrayList<>();
        words.add("Apple");
        words.add("Kinge");
        words.add("Queen");
        words.add("Umbrella");
        for (int i=0; i<words.size(); i++){
            if (words.get(i).endsWith("e")){
                words.remove(i);
            }
        }
        System.out.println(words);
    }
}
