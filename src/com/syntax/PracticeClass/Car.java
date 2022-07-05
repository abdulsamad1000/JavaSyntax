package com.syntax.PracticeClass;

public class Car {
    String name;
    String color;
    String model;
    int year;
    void printInfo(){
        System.out.println("Name"+name+"Color"+color+"Model"+model+"Year"+year);
    }
    public Car(String name, String color, String model, int year) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.year = year;
    }
}
class BMW extends Car{
    public BMW(String name, String color, String model, int year) {
        super(name, color, model, year);
    }
}
class Toyota extends Car{
    public Toyota(String name, String color, String model, int year) {
        super(name, color, model, year);
    }
}
class Tester{
    public static void main(String[] args) {
      BMW bmw=new BMW(" aa"," bb"," l99",2020);
      bmw.printInfo();
      Toyota toyota=new Toyota(" UU"," KKK"," U77",2012);
      toyota.printInfo();


    }
}