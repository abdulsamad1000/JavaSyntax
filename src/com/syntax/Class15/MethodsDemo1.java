package com.syntax.Class15;

public class MethodsDemo1 {


        void method1(){
            System.out.println("i can use print statements in a void type method");
            int num = 0;
            // return "bal bla"; because we use void mean no data will be returned from this method
        }
        public static void main (String[]args){
            MethodsDemo1 methodsDemo1 = new MethodsDemo1();
            // int x=MethodsDemo1.method1(); // note here method with void return type can not be assigned to return type of variable
            // because int is reutrn type of data type
        }

    }

