package com.syntax.Class10Arrays;

public class Arraypractice {
    public static void main(String[] args) {
        int []numbers={10,20,3,40,889,50};
        int sum=0;
        for (int a:numbers){
            sum+=a;
        }
        System.out.println("sum of all the elements are ="+sum);

        System.out.println();
        System.out.println("======================");
        int []numbers1={10,20,3,40,889,50};
       int sum1=0;
       for (int i=0; i<numbers1.length; i++){
           sum1+=numbers1[i];
       }
        System.out.println("sum of all the elements are ="+sum1);
    }
}
