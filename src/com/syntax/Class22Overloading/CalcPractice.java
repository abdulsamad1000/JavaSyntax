package com.syntax.Class22Overloading;

public class CalcPractice {
   static void sum(int ... arr){
       int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
       System.out.println("sum of all the parameters valuse is "+sum);
    }

    public static void main(String[] args) {
        sum(2,2,3,4);
    }
}
