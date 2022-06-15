package com.syntax.Class15;

public class VariablesDemo1 {
    String name;  // what kind of variable is this. answer is instance variable because it is not inside the method
    static int num=5; // what kind of variable is this. answer is Static variable because it has key word static
    void printName(){
        String name="Mike";  // what kind of variable is this. answer is local variable because it is inside the method
        System.out.println(name);
    }

    public static void main(String[] args) {
        VariablesDemo1 v=new VariablesDemo1();
        v.printName();
    }
}
