package com.syntax.Class19;

public class EnglishClass {
    // English Class A
    String name;
    String type;
    int duration;

    void printInfo(){
        System.out.println("Name "+name+" Type "+type+" Duration "+duration);
    }
}
// English Class B
class Begginer extends EnglishClass{
    Begginer(String name,String type, int duration){
        this.name=name;
        this.type=type;
        this.duration=duration;
    }
}
// English Class C
class Advance extends EnglishClass{
    Advance(String name,String type,int duration){
        this.name=name;
        this.type=type;
        this.duration=duration;
    }
}