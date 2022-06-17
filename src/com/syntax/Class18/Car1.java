package com.syntax.Class18;

import javax.imageio.stream.ImageInputStream;

public class Car1 {
    String name;
    String make;
    String model;
    int year;
    Car1(String car1Name, String car1Make, String car1Model, int car1Year){
        name=car1Name;
        make=car1Make;
        model=car1Model;
        year=car1Year;

        }

    public static void main(String[] args) {
        Car1 Toyota=new Car1("Toyota","SUV","Highlander",2021);

    }
    }





