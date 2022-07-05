package com.syntax.Class4NestedIfAndScannerPractice;

public class NestedIfExp4 {
    public static void main(String[] args) {
        boolean checkreplcomplete=true;
        int repl=18;
        if (checkreplcomplete){
            System.out.println("How many repl have you done so far");
            if (repl>15){
                System.out.println(" you did a great job");
            }else if(repl>9){
                System.out.println("you did a good job");
            }else {
                System.out.println("you need to work hard on your repl");
            }
        }else {
            System.out.println(" please complete your homework on time");
        }


    }
}
