package com.syntax.Class11;

public class FibonacciDemo {
    public static void main(String[] args) {
        // write a program to pritn the firt 10 numbers of fiboncci series.
        int priveiosNumber=0;
        int currentNumbers=1;
        int nextNumber=0;
        int numberToPrint=20;
        System.out.println(0+" ");
        System.out.println(1+" ");
        for (int i=0; i<priveiosNumber+currentNumbers -2; i++){
            nextNumber=priveiosNumber+currentNumbers;
            System.out.println(numberToPrint);
            priveiosNumber=currentNumbers;
            currentNumbers=nextNumber;
        }
    }
}
