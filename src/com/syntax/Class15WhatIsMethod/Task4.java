package com.syntax.Class15WhatIsMethod;

public class Task4 {
    // created a method that will say hello in diffrent
    // lanugage based on the country that will passed when method is executed
    void sayHello(String country){
        String hello;
        switch (country){
            case "USA":
                hello="Hola";
                break;
            case "Afghanistan":
                hello="Salamona";
                break;
            case "Russia":
                hello="Bonja";
                break;
            case "Turky":
                hello="Merhaba";
                break;
            case "Indai":
                hello="Namastay";
                break;
            case "France":
                hello="Monjar";
                break;
            default:
                hello="Country not found";
        }
        System.out.println(hello);
    }
    public static void main (String[]args){
        Task4 task4=new Task4();

    }

}
