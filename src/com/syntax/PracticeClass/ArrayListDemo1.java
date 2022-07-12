package com.syntax.PracticeClass;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');
        System.out.println(characters);
        System.out.println(characters.get(2));
        System.out.println(characters.size());
        for (int i=0; i<characters.size();i++){
            System.out.println(characters.get(i));
        }
    }
}
