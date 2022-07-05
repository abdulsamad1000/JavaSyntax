package com.syntax.Class12StringManipulaion;

public class StringDemo {
    public static void main(String[] args) {
        String str=" SUKJHYTRFDSSSETSSSSSSSSSSGKKOIHGGGTREEDSSSSSAWSSXCVBNKKKKKKKKNMNVC";
        int counter=0;
        for (int i=0; i<str.length(); i++){
            if ('S'==str.charAt(i)){
                counter++;
            }
        }
        System.out.println("the letter K has been repeated in this sting "+counter);
    }
}
