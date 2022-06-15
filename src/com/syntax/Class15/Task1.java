package com.syntax.Class15;

public class Task1 {

    // create a method that will take 2 parametes as a numbers and prints which number is larger
    // what would be the written type which mean how we can execute this
    // this would be void method.
    void printLarger(int num1,int num2){
        int larger=0;
        if (num1>num2){
            larger=num1;
        }else if (num2>num1){
            larger=num2;
        }
        System.out.println(larger);
    }
    // to call this class we need an object of this class here under the main method

    public static void main(String[]args){
        Task1 task1=new Task1();
        task1.printLarger(12,24);

    }
}
