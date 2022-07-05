package com.syntax.Class22Overloading;

public class EmployeeTester {
    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.calculatePrintSalary();

        OfficeBoy officeBoy=new OfficeBoy();
        officeBoy.calculatePrintSalary();
    }
}
