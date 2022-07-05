package com.syntax.Class14StringManipulation;

public class Task2 {
    public static void main(String[] args) {

        // creating a string which would be combination of letters numbers and spcail chracters and find how how many
        // Alphanumeric characters are their in the string
        // what is Alpha numeric characters
        // Alpaha numeric characters are those characters which has letters , numbers and specail characters it call alphanumeric

        String str="abdulsamdki12456789!@#$%^&*";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]","").length());


        System.out.println();
        System.out.println("==============");
        String str1="ajjdj djsjjlsj1245545877";
        System.out.println(str1.length());

        System.out.println();
        System.out.println("==============================");
        String str2="akjdjjASEYUIKJGFD12457586544!@#$%^&*><?";
        System.out.println(str2.replaceAll("[^A-Za-z0-9]","??????"));
    }
}
