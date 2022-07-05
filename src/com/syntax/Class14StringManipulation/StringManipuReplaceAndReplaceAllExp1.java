package com.syntax.Class14StringManipulation;

public class StringManipuReplaceAndReplaceAllExp1 {
    public static void main(String[] args) {
        // i have this string I never forget about recording ---- i want to replace never with always
        // what string manipulation i can use i can use this String manipulation

        String str="I never forget about recording";  // i want replace never with always
        System.out.println(str.replace("never","always"));
        String str1="I want to go the beach tommrow";
        System.out.println(str.replace("tommrow","today"));
        String str3=" you are really beautful like always";
        System.out.println(str3.replace("beautful","pretty"));
        String str4=" i want to go to school";
        System.out.println(str4.replace("i want to go to school","i want to go to my class"));
        // anthro example
        String str5="you are really smart";
        System.out.println(str5.replaceAll("you are really smart","you are really lazy"));
        String str6=" akfjoiedwibcn15469873210005246578@#$!;LKIUYTREMKIQA";
        System.out.println(str6.replaceAll("[0-9]","AAAAA"));


    }
}
