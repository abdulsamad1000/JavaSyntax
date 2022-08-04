package com.syntax.PracticeClass;

public class HowToAssignOneValueToAntherValue {
    public static void main(String[] args) {

        int num =10;
        int num2 =15;

        num=num+num2;  // here the value of num would be 25
        num2=num2-num;  // here the value of num2 would be 5

        num=num-num2;
        System.out.println("the num value would be =" +num);
        System.out.println("the num2 value would be =" +num2);
        System.out.println(num);


    }
}
