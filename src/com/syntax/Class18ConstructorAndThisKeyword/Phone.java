package com.syntax.Class18ConstructorAndThisKeyword;

public class Phone {

    // this is all practice for Constructor how to create a constructor and how to use and test them.
    private String name;
    private String model;
   private int storage;
    private double screen;

    public Phone(String phoneName, String phoneModel, int phoneStorage,double phoneScreen){
        name=phoneName;
        model=phoneModel;
        storage=phoneStorage;
        screen=phoneScreen;
    }
    void printInfo(){

          System.out.println("Name "+name+" Model "+model+" Storage "+storage+" Screen "+screen);
    }
}
