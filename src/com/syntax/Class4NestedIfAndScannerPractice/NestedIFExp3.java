package com.syntax.Class4NestedIfAndScannerPractice;

public class NestedIFExp3 {
    public static void main(String[] args) {
        String day="tuesday";
        int date= 10;
        if (day.equals("sunday")){
            System.out.println(" lets check our clander what class we have today");
            if (date==8){
                System.out.println(" we have a java class");
            }
        }else if(day.equals("tuesday")){
            System.out.println(" let me check the clander what we have today");
            if(date==10){
                System.out.println("we have a manual class");
            }
        }


    }
}
