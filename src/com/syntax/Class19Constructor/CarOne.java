package com.syntax.Class19Constructor;

public class CarOne {
    String name;
    String make;
    String model;

    public CarOne(String caroneName,String caroneMake,String caroneModel){
        make=caroneMake;
        name=caroneName;
        model=caroneModel;
    }
    void printInfo(){
        System.out.println("Make "+make+" Name "+name+" Model "+model);
    }
}
