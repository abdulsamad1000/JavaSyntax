package com.syntax.Class12StringManipulaion;

public class StringDemo5 {
    public static void main(String[] args) {
        String str="12345645879965415558788655441233555";
        int counter=0;
        for (int i=0; i<str.length(); i++){
            if ('5'==str.charAt(i)){
                counter++;
            }
        }
        System.out.println("the number 5 has been repeated how many times "+counter);
    }
}
