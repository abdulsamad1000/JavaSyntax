package com.syntax.Class29;

import java.util.Collection;
import java.util.HashMap;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String,Double> fruite=new HashMap<>();
        fruite.put("apple",2000.0);
        fruite.put("orange",2300.0);
        fruite.put("kiwi",60.90);
        fruite.put("banana",56.90);
        fruite.put("apple",90.89);

        Collection<String> keys=fruite.keySet();
        keys.removeIf(key->key.contains("e"));

        // Iterator<String>iterator=keys.iterator();
        // while (iterator.hasNext()){
        // if(iterator.next().contains("e")){
        //    iterator.remove();
        //    }
        //  }
        System.out.println(fruite);


    }
}
