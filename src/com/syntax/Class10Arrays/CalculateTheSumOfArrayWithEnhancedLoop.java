package com.syntax.Class10Arrays;

public class CalculateTheSumOfArrayWithEnhancedLoop {
    public static void main(String[] args) {
        int []arr={1,5,4,6,4,78,9,856};
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("the sum of all the elements are ="+sum);
    }
}
