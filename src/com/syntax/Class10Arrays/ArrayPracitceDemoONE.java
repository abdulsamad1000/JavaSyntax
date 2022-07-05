package com.syntax.Class10Arrays;

public class ArrayPracitceDemoONE {
    public static void main(String[] args) {
        // find the sum of all the array
        int []numbers={1,2,3,4,5,6,7,8};
        int sum=0;
        for (int i=0; i<numbers.length; i++){
            sum+=numbers[i];
        }
        System.out.println("the sum of alll the array are ="+sum);

        System.out.println();
        System.out.println("==========================");
        // find the lenght of the array
        int []arr={10,20,30,40,50};
        System.out.println(arr.length);

        System.out.println();
        System.out.println("==========================");
        // we want to print all the array elements
        int [] arr2={1,2,3,4,5,6};
        for (int a=0; a<arr2.length; a++){
            System.out.print(arr2[a]+" ");
        }
    }
}


