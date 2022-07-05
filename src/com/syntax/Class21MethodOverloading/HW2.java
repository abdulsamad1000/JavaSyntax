package com.syntax.Class21MethodOverloading;

public class HW2 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
}
    class Animal{
        static void germancat(String name,String breed,int age){
            System.out.println("Name "+name+" breed "+breed+" age "+age);
        }
        static void austerliancat(String name,String breed,int age,double weight){
            System.out.println("Name "+name+" breed "+breed+" age "+age+" weight "+weight);
        }
        static void usacat(String name, String breed,int age,double weight, double height){
            System.out.println("Name "+name+" breed "+breed+" age "+age+" weight "+weight+" height "+height);
        }
        public static void main(String[] args) {
            germancat("Husky","Austerlian",4);
            austerliancat("Husky2","Austelian",3,6);
            usacat("Husk3","USA",5,7,1.8);
        }
    }


