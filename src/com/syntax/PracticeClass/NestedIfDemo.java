package com.syntax.PracticeClass;

public class NestedIfDemo {
    public static void main(String[] args) {
        int age =17;
        if (age<20){
            System.out.println("you are not eligible to work in the US");
        }else {
            System.out.println("you should wait one more year");
        }
        if(age>18){
            System.out.println("you are allowed to work anywhere in the US");
        }else {
            System.out.println("you should work more and enjoy your life");
        }
    }
}
