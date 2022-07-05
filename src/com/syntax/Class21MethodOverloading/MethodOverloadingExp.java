package com.syntax.Class21MethodOverloading;

public class MethodOverloadingExp {
    void method(String name){
        System.out.println("the name is hamid");
    }
    void method(String name1, int age ){
        System.out.println("the name is Hamid the age is 21");
    }
    void method(String name2,String nam3,int age){
        System.out.println("the name is hamd, jan and 33");
    }

    public static void main(String[] args) {
        MethodOverloadingExp ME=new MethodOverloadingExp();
        ME.method("hamid");
        ME.method("hamid",21);
    }
}
