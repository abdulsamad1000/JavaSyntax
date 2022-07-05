package com.syntax.Class15WhatIsMethod;

public class Task3 {
    // create a method that will print whether given String is palindrome or not.
    // what is palindrome String if i revese a String and get the same String it call palindrome
    // the written type of this method is void

    void printIspalindrome(String str){
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        String reversedStr=stringBuilder.toString();
        if (str.equals(reversedStr)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is palindrom");
        }
    }

public static void main (String[]args){
        Task3 task3=new Task3();
        task3.printIspalindrome("dad");
        task3.printIspalindrome("Alidan");

}
}
