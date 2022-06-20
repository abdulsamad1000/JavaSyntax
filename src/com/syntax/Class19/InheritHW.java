package com.syntax.Class19;

public class InheritHW {
    //Write program to inherit class A that has method printF.
    //which is static and call or reuse that method into class B
    static String name;
    static String printF(){
        return name;
    }
}
class ClassB{
    public static void main(String[] args) {
        InheritHW.name="Mike";
        String name=InheritHW.printF();
        System.out.println("Teacher name is "+name);
    }
}
