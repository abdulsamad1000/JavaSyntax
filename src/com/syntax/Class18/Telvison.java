package com.syntax.Class18;

public class Telvison {
   private String name;
    private String model;
    private double screen;
    private int size;

   protected Telvison(String telvisonName,String telvisonModel,double telvisonScreen, int telvisonSize){
        name=telvisonName;
        model=telvisonModel;
        screen=telvisonScreen;
        size=telvisonSize;

    }
    void printInfo(){
        System.out.println("Name "+name+" Model "+model+" Screen "+screen+" Size "+size);
    }



}
