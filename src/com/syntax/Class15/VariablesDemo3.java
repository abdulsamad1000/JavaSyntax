package com.syntax.Class15;

public class VariablesDemo3 {
    static int num=5;
    String name;

    public static void main(String[] args) {
        VariablesDemo3 v1=new VariablesDemo3();
        v1.name="Abdul";

        VariablesDemo3 v2=new VariablesDemo3();
        v2.name="jason";

        VariablesDemo3 v3=new VariablesDemo3();
        v3.name="khan";
        System.out.println(v1.name);
        System.out.println(v1.num);

        System.out.println(v2.name);
        System.out.println(v2.num);
    }

}
