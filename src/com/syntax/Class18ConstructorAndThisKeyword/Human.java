package com.syntax.Class18ConstructorAndThisKeyword;

public class Human {
   private String name;
    private int age;
    private double height;
    private double weight;
    private String color;
    public Human(){

    }
   public Human(String humanName, int humanAge, double humanHeight, double humanWeight,String humanColor){
        name=humanName;
        age=humanAge;
        height=humanHeight;
        weight=humanWeight;
        color=humanColor;
    }
    public Human(String humanName){
        name=humanName;
    }
    void printHumanName(){
        System.out.println("Name"+name);
    }
    void printInfo(){
        System.out.println("Name "+name+" Age "+age+" Height "+height+" Weight "+weight+" Color "+color);
    }
}
