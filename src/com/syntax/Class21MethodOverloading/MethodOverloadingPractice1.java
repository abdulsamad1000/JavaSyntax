package com.syntax.Class21MethodOverloading;

public class MethodOverloadingPractice1 {
    static void method(String name,int age){
        System.out.println("name is ahamad and age is 21");
    }
    static void method(String name,int age,double height){
        System.out.println("ahamad, 21, 14.4");
    }
    static void method(String name,int age,double height,double weight){
        System.out.println("ahamad 21, 14.4, 189lb");
    }

    public static void main(String[] args) {
        method("ahamad",21,14.4,189);
        method("ahamad",21);
    }
}
