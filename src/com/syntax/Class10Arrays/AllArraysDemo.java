package com.syntax.Class10Arrays;

public class AllArraysDemo {
    public static void main(String[] args) {
        // create String of arrays and find the length of it
        // find the length of this one D array
        String []arr={"Abdul","Paul","John","Mike","Bob","logan","Toshio","Adila"};
        System.out.print(arr.length);

        System.out.println();
        System.out.println("==================");
        // here we print all the elements of the array
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("==================");
        // here we print all the index of the array for each elements
        for (int i=0; i<arr.length; i++){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("==================");
        // if we want to print one index of array
        System.out.println(arr[0]);

        System.out.println();
        System.out.println("==================");
        // create a 2Darray of string type and print the length and index of the array
        String [][] arr2={ {"youtub","facebook","googel","chrom","firfor","edge","google"},
                {"instagram","snapchat","tineder","puff"},
                {"tiktalk","whatsup","massanger"} };
        System.out.println(arr2[0].length);
        System.out.println(arr2[1].length);
        System.out.println(arr2[2].length);



        }
    }

