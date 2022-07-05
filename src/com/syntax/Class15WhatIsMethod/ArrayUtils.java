package com.syntax.Class15WhatIsMethod;

public class ArrayUtils {

    // Note
    // Example we want to create an array for that we have to create a for loop to print those array correct
    // now we want to create an array and we do not have to use a for loop for it.
    // for that we need to create a method.
    // qeustion which kind of method should we use to print those array
    // the written type of this method would be void method the name of this method would be printArray
    // how did we create an array we call it inside the prenthesis like this (int [] arr)
        void printArray(int [] arr){
            for (int num:arr){
                System.out.println(num);
            }
        }
        int sumArray(int[]arr){
            int sum=0;
            for (int num:arr){
                sum=sum+num;
            }
            return sum;
        }
}
