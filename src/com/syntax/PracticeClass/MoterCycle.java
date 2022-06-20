package com.syntax.PracticeClass;

public class MoterCycle {

    String name;
    String model;
    int year;
    void printInfo(){
        System.out.println("Name"+name+" Model "+model+" Year "+year);
    }
    MoterCycle(String name,String model,int year){
        this.name=name;
        this.model=model;
        this.year=year;
    }
    MoterCycle(String name,String model){
        this.name=name;
        this.model=model;
    }
}
class Hurly extends MoterCycle{
    Hurly(String name,String model,int year){
        super(name, model, year);
    }
}
class Davis extends MoterCycle{
    Davis(String name,String model,int year){
      super(name, model);
    }
}
