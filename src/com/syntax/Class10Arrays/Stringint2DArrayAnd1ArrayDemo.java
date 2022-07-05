package com.syntax.Class10Arrays;

public class Stringint2DArrayAnd1ArrayDemo {
    public static void main(String[] args) {
        String []arr={"ahamad","mohammod","arif","bilal","imal","khan"};
        System.out.println(arr.length);
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("==================");
        System.out.println(arr[0]);
        System.out.println();
        System.out.println("==================");
        for (String names:arr){
            System.out.print(names+" ");
        }

    }
}
