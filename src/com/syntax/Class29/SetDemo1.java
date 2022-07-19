package com.syntax.Class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);

      numbers= new ArrayList<>(new LinkedHashSet<>(numbers));
        System.out.println(numbers);
    }

}
