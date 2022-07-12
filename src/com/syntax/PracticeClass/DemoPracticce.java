package com.syntax.PracticeClass;

import java.util.Locale;

public class DemoPracticce {
    public static void main(String[] args) {
        String name="KHAN";
        String name2="KING";
        String name3="JHON";
        String name4="MIKE";
        String name5="NINC";
        String []names={"KHAN","KIING","JHON","MIKE","NINC"};
        System.out.println(names[0]);
        System.out.println(names.length);
        for (int i=0; i<name.length(); i++){
            System.out.print(names[i]+" ");
            System.out.print(names[3]);
            System.out.println(name.indexOf(1));
            System.out.println(name.contains("K"));
            System.out.println(name2.isEmpty());
            System.out.println(name3.equalsIgnoreCase("Jhon"));

        }
        System.out.println("===============");
        String name8="abdulsamad";
        System.out.println(name8.toUpperCase(Locale.forLanguageTag("abdulsamad")));

    }

}
