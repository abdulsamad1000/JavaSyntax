package com.syntax.Class21MethodOverloading;

public class MethodOverloadingWithDiffDataTypePracitce {
    static void School(){
        System.out.println("1");
    }
    static void School(String name){
        System.out.println("2");
    }
    static void School(String name,int num){
        System.out.println("3");
    }
    static void School(int num1,int num){
        System.out.println("4");
    }
    static void School(int num,String name){
        System.out.println("5");
    }

    public static void main(String[] args) {
        MethodOverloadingWithDiffDataTypePracitce mp=new MethodOverloadingWithDiffDataTypePracitce();
        mp.School(65,85);
    }
}
