package com.syntax.Class19Constructor;

public class Teacher {

   // Write a Java program called Teacher.  Identify features and behaviour of that Class. Create 3 subclasses MathTeacher,
    // ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes
    String name;
    String title;
    String shift;

    void printInfo(){
        System.out.println("Name is "+name+" Title is "+title+" Shift is "+shift);
    }
}

 class MathTeacher extends Teacher{
    MathTeacher(String name,String title, String shift){
        this.name=name;
        this.title=title;
        this.shift=shift;
    }
 }
 class ChemistryTeacher extends Teacher{
    ChemistryTeacher(String name,String title,String shift){
        this.name=name;
        this.title=title;
        this.shift=shift;
    }
 }
 class PianoTeacher extends Teacher{
    PianoTeacher(String name, String titel,String shift){
        this.name=name;
        this.title=titel;
        this.shift=shift;
    }
 }