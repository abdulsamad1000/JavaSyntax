package com.syntax.Class10Arrays;

public class FindADuplicateNumFromTheArray {

    public static void main(String[] args) {
        // write a program to print out the duplicate elements from the array of string
        String []arr={"a","b","c","a","b"};
        for (int i=0; i<arr.length; i++){
            for (int j=0; j< arr.length; j++){
                if (arr[i].equals(arr[j])&& i!=j){
                    System.out.println(arr[i]);

                }
            }
        }
    }
}
