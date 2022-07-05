package com.syntax.Class12StringManipulaion;

public class howtoreverseaString {
    public static void main(String[] args) {
        String name="Abdulsamad Momand";
        for (int i=name.length()-1; i>=0; i--){
            System.out.print(name.charAt(i));
        }
        System.out.println();
        System.out.println("=====================================");
        String str="UNITED STATE OF AMERICA";
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        }
    }

