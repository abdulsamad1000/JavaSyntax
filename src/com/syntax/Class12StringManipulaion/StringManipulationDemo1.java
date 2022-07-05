package com.syntax.Class12StringManipulaion;

public class StringManipulationDemo1 {
    public static void main(String[] args) {
        // this is how we can calculate the string
        String name = "kabulafghanistan";
        System.out.println(name.length());
        // this the method which we cna convert from uppercase letter to lowerecase
        String name1 = "ABDULSAMAD";
        System.out.println(name1.toLowerCase());
        // this is method which we can covert from lower to uppercase
        String name2 = "abdulsamad momand";
        System.out.println(name2.toUpperCase());

        String name3 = "   book     ";
        System.out.println(name3.trim());
        String str = "i am great student in the Class";
        System.out.println(str.startsWith("i"));
        System.out.println(str.endsWith("student"));
        System.out.println(str.endsWith("class"));
        System.out.println(str.toLowerCase().endsWith("Class"));
        String str1 = "AHMAD";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.contains("H"));
        System.out.println(name2.toUpperCase().contains("great"));
        String str2 = "ahamad";
        String str3 = "ahamad";
        System.out.println(str2.equals(str3));
        System.out.println();
        System.out.println("=========================");
        String str4 = " i am the best student in java class";
        int counter=0;
        for (int i=0; i<str4.length(); i++){
            if ('s'==str4.charAt(i)){
                counter++;
            }
        }
        System.out.println("s would be appereda in the string "+counter);
    }
}
