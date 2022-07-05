package com.syntax.Class12StringManipulaion;

public class StringDemo2 {
    public static void main(String[] args) {
        String str="abdulsamadjhonnafaskingutosamadhajijsamadarif";
        int counter=0;
        for (int i=0; i<str.length(); i++){
            if ('s'==str.charAt(i)){
                counter++;
            }
        }
        System.out.println("letter s has been repeted "+counter);

    }
}
