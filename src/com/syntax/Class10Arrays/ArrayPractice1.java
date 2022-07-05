package com.syntax.Class10Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {
        //  the same example with enhanced loop
        int []arr={1,2,3,4,5};
        int sum=0;
        for (int x:arr){
            sum+=x;
        }
        System.out.println("sum of all the elements are ="+sum);
        System.out.println("===============================================");
        // the same example with for loop
        int []arr1={1,2,3,4,5};
        int sum1=0;
        for (int i=0; i<arr1.length; i++){
            sum1+=arr1[i];
        }
        System.out.println("sum of all the elements are ="+sum1);

        // find the Even number from the array
        System.out.println("===============================================");
        int []numbers={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        int Even=1;
        for (int i=1; i<=numbers.length; i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        // find the Odd number from the array
        System.out.println("===============================================");
        int []numbers1={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,};
        int Odd=0;
        for (int i=0; i<=numbers1.length; i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        // find the Odd number length from the array
        System.out.println("===============================================");
        int []numbers2={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,};
        System.out.println(numbers2.length);

        System.out.println();
        // print me  the Odd number elements from the array
        System.out.println("===============================================");
        int []numbers3={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,};
        for (int i=0; i<numbers3.length; i++){
            System.out.print(numbers3[i]+" ");

            System.out.println();
            // from array of integres find the larges numbers
            System.out.println("===============================================");
            int []numbers4={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,};
            int max=numbers4[0];
           for (int num:numbers4){
               if (num>max){
                   max=num;
               }
           }
            System.out.println("the largest numbers is "+max);
            System.out.println();
            System.out.println("===================");


        }
    }
}
