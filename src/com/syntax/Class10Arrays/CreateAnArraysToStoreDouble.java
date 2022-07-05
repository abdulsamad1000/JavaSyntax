package com.syntax.Class10Arrays;

public class CreateAnArraysToStoreDouble {
    public static void main(String[] args) {
        double[] numbers={10.99,20.99,30.99,40.99};
        System.out.println(numbers.length);
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        System.out.println("============");
        System.out.println(numbers.length);
        System.out.println(numbers[3]);

        System.out.println();
        System.out.println("==================");
        for(double price:numbers){
            System.out.print(price+" ");
        }
        }
        }



