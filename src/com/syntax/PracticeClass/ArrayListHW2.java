package com.syntax.PracticeClass;

import java.util.ArrayList;

public class ArrayListHW2 {
    public static void main(String[] args) {
        /**
         * Create an ArrayList of cars and retrieve all the values using 3 differents ways,
         */
        ArrayList<String> car=new ArrayList<>();
        car.add("Toyota");
        car.add("Hunda");
        car.add("BMW");
        car.add("Tesla");
        System.out.println(car);

       for(int i=0; i<car.size(); i++){
           System.out.println(car.get(i));

       }
       for (String car1:car){
           System.out.println(car1);
       }
    }
}
