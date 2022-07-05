package com.syntax.Class12StringManipulaion;

public class StringDemo6 {
    public static void main(String[] args) {
        String str="12345678978944561231124566578799654789555422333644789988874211122254444444555555544444";
        int counter=0;
        for (int i=0; i<str.length(); i++){
            if('1'==str.charAt(i)){
                counter++;
            }
        }
        System.out.println("the number 1 has been repeated ="+counter);
    }
}
