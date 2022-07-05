package com.syntax.Class10Arrays;

public class StringArrayDemo {
    public static void main(String[] args) {
        // print the String arrays
        String []arr={"ahamad","khan","jan","quraban"};
        System.out.println(arr[0]);
        System.out.println(arr.length);
        System.out.println();
        System.out.println("==================");
        for(int a=0; a< arr.length; a++){
            System.out.println(arr[a]);
        }


        System.out.println();
        System.out.println("==================");
        int[][]numbers={
                {10,20,30,40,50,60},
                {70,80,90},
                {100,110,120},
                {1,2,3,4,}
        };
        System.out.println(numbers[0][5]);
        System.out.println(numbers.length);
        System.out.println();
        System.out.println("==================");
        int []arr1={1,20,30,50,4,8,90,12,45,63,28};
        System.out.println(arr1[8]);
        System.out.println(arr1.length);

        System.out.println();
        System.out.println("==================");
        String []arr2={"a","b","c","d","e","f","g"};
        System.out.println(arr2[0]);
        System.out.println(arr2.length);

        System.out.println();
        System.out.println("==================");
        for(int i=0; i< arr2.length; i++){
            System.out.println(arr2[i]+"");
        }
    }
}
