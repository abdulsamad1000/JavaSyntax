package com.syntax.Class15WhatIsMethod;

public class MethodDemo2 {
    public static void main (String[] args){
        int [] arr={ 10,20,30,40,50};
        ArrayUtils arrayUtils=new ArrayUtils();
        arrayUtils.printArray(arr);
        int sum=arrayUtils.sumArray(arr);
        System.out.print(sum);

    }
}
