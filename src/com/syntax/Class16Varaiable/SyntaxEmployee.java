package com.syntax.Class16Varaiable;

public class SyntaxEmployee {
        //Create a Class called SyntaxEmployee:
        //Create three  variables  empID , salary and set the CEO to “Sumair”
        //Create two objects of the class SyntaxEmployee
         //Set the value of eID, salary for each of the objects
         //  Print out the eID , salary and  CEO for each of the objects

    int empID;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee SE=new SyntaxEmployee();
        SE.empID=44;
        SE.salary=150000;
        SyntaxEmployee SE2=new SyntaxEmployee();
        SE2.empID=35;
        SE2.salary=140000;
        System.out.println("ID number "+SE.empID+" the salary is "+SE.salary+" the CEO name is "+CEO);

    }
}
