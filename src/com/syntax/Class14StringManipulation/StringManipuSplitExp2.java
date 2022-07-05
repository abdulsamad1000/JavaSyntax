package com.syntax.Class14StringManipulation;

import java.util.Locale;

public class StringManipuSplitExp2 {
    public static void main(String[] args) {
        String str="i am one the best stuedent?  i am one of the middel student?   i am one of the last student?  ";
        String []arr=str.split("[?]");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println();
        System.out.println("============================================");
        String str1=" 1.i love java, 2.i hate java, 3.i like java, i do not like java,";
        String []arr1=str1.split("[,]");
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);

        System.out.println();
        System.out.println("==============================");
        String str2=" good morning guys. good afternoon guys. good evening guys. good night guys.";
        String []arr2=str2.split("[.]");
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        System.out.println();


        System.out.println("==============================");
        String str3="is it saturday? is it raining today? do we have a java class today?";
        String []arr3=str3.split("[?]");
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println(str3.split("[?]").length);

        System.out.println();
        System.out.println("==============================");
        String str4=" 1.WHAT is your name? 2.what is your father name? 3.where are you from?";
        String []arr4=str4.split("[?]");
        System.out.println(arr4[0]);
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);
        System.out.println(str4.length());
        System.out.println(str4.replace("what","when"));
        System.out.println(str4.replaceAll("what is your name?","what is your mother name?"));
        System.out.println();
        System.out.println("==============================");
        String str5="HOW ARE YOU";





    }
}
