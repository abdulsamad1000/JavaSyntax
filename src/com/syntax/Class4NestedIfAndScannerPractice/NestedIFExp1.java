package com.syntax.Class4NestedIfAndScannerPractice;

public class NestedIFExp1 {
    public static void main(String[] args) {
     // vaccine how many dose of vaccine you had in the past
        // if the user say i have got 1 dose and i need one more
        boolean vaccine=true;
        int dose=2;

        if (vaccine){
            System.out.println(" you have completed all your doses");
            if (dose==1){
                System.out.println(" you need one more shot");
            }else {
                System.out.println(" you are fully vaccinted");
            }
        }
    }
}
