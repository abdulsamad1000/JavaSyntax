package com.syntax.Class21MethodOverloading;

public class HW3 {
    /*
    Create 1 class with a private method that has 3 overloaded forms.Then call each overloaded method with specific arguments and observe result.
     */
}
class cars{
    private void Toyota(String name){
        System.out.println("Name "+name);
    }
    private void BMW(String name,String model){
        System.out.println("Name "+name+" Model "+model);
    }
    private void Honda(String name,String model,int year){
        System.out.println("Name "+name+"Model "+model+"Year "+year);
    }
    public static void main(String[] args) {
        cars Toyota=new cars();
        Toyota.Toyota("Toyota");
        cars BMW=new cars();
        BMW.BMW("BMW","RX450");
        cars Honda=new cars();
        Honda.Honda("Honda","GX350",2021);
    }
}
