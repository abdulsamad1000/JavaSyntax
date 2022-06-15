package com.syntax.Class15;

public class VariablesDemo2 {
    int num=10;
    // NOTE: when ever you have to share some information in more than one methods of class use instance variable
    // NOTE: We can not access local variable from one method to anthor method because the local variable is accessible only inside
    // that method not outside
    void method1(){
        System.out.println(num);
    }
    void method2(){
        System.out.println(num);
    }

}
