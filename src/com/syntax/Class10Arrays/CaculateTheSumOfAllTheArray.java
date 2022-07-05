package com.syntax.Class10Arrays;

public class CaculateTheSumOfAllTheArray {
    public static void main(String[] args) {
        // create an array of the integers and caculate the sum of all the elements
        int []numbers={1,2,3,4,5,6,7,8,9};
        int sum=0;
     for (int i=0; i<numbers.length; i++){
         sum+=numbers[i];
     }
        System.out.println("sum of all the elements are ="+sum);

        System.out.println();
        System.out.println("==================");
        // i want to call culate the sum of all the array i will use the for loop for to get the sum of the array
        int []num={10,20,3,0,15,14,78,45,11,233,45,445,889,566};
        int sum1=0;
        for (int i=0; i<num.length; i++){
            sum1+=num[i];
        }
        System.out.println("the sum of all the elements are ="+sum1);
        System.out.println();
        System.out.println("==================");
        int []num2={1,8,5,6,4,7,9,};
        int sum3=0;
        for (int i=0; i<num2.length; i++){
            sum3+=num2[i];
        }
        System.out.println("sum of all the elements are ="+sum3);

        System.out.println();
        System.out.println("==================");
        sum=0;
        for (int x:num2){
            sum+=x;
        }
        System.out.println("sum of the elements are ="+sum);

        System.out.println();
        System.out.println("==================");
        int []arr={1,2,3,4,5,6,7,8,9};
        int Even=1;
        for (int i=1; i<9; i++){
            if(i%2==0){
                System.out.print(i+"");
            }
        }

        System.out.println();
        System.out.println("==================");
        int []arr1={5,8,9,7,4,6,32};
        int Odd=0;
        for (int i=0; i<32; i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }

    }
}
