package com.syntax.PracticeClass;

public class StringDemo1 {
    public static void main(String[] args) {
        String Name ="Khan";
        System.out.println(Name);

        // concatanation exmple

        String fistName ="Arif";
        System.out.println(Name+" "+fistName);

        int num =10;
        int num1= 20;
        System.out.println(num+num1);
        System.out.println(num/num1);
        System.out.println(num*num1);
        System.out.println(num-num1);

        double price=10.99;
        int y =(int) price;
        System.out.println(y);

        int b=10;
        int c=5;
        System.out.println(10%5);
        System.out.println();
        System.out.println("***********************");
        int age = 21;
        if (age<20){
            System.out.println(" you are not eligible to work in US");
        }else if (age>20){
            System.out.println("you are authorized to work");
        }
        System.out.println();
        System.out.println("&&&&&&&&&&&&&&&&&&");
        int age1 =20;
        if (age>15){
            System.out.println(" go and fine a job");
        }

    }
}
