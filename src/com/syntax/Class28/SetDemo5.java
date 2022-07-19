package com.syntax.Class28;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo5 {
    public static void main(String[] args) {

        HashSet<String> Cars=new HashSet<>();
        Cars.add("Toyota");
        Cars.add("BMW");
        Cars.add("Douge");
        Cars.add("Jeep");
        Cars.add("Luxuse");
        Cars.add("Pourch");
        Cars.add("Hounda");
        System.out.println(Cars);

        System.out.println("#######################################################################");
        Iterator<String> iterator=Cars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("#######################################################################");
        for(String car:Cars){
            System.out.println(car);
        }
    }
}
