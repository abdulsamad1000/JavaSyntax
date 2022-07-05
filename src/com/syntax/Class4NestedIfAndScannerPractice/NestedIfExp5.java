package com.syntax.Class4NestedIfAndScannerPractice;

public class NestedIfExp5 {
    public static void main(String[] args) {
        // check if you have a high school diploma
        // if your GPA is 2 you will be eligible for a sholoarship

        boolean diploma=false;
        int gpa=4;
        if (diploma){
            System.out.println(" check if you have a diploam ");
            if (gpa>2){
                System.out.println("you are eligible for a scholorship");
            }else if (gpa<2){
                System.out.println("you are not eligible for a scholorship");
            }
        }else {
            System.out.println("you need to study to be eligible for scholorship in the future");
        }
    }
}
