package com.syntax.PracticeClass;

public class Human {
    String name;
    String color;
    int age;
    double weight;

    public Human(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
class Employee extends Human{
    String EmployeeID;
    double Salary;
    String Title;
    String Department;

    public Employee(String name, String color, int age, double weight, String employeeID, double salary, String title, String department) {
        super(name, color, age, weight);
        EmployeeID = employeeID;
        Salary = salary;
        Title = title;
        Department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeID='" + EmployeeID + '\'' +
                ", Salary=" + Salary +
                ", Title='" + Title + '\'' +
                ", Department='" + Department + '\'' +
                '}';
    }
}
class SDET extends Employee{
    String programingLanguage;
    String frameWork;
    boolean knowSelenium;

    public SDET(String name, String color, int age, double weight, String employeeID, double salary, String title, String department, String programingLanguage, String frameWork, boolean knowSelenium) {
        super(name, color, age, weight, employeeID, salary, title, department);
        this.programingLanguage = programingLanguage;
        this.frameWork = frameWork;
        this.knowSelenium = knowSelenium;
    }

    @Override
    public String toString() {
        return "SDET{" +
                "programingLanguage='" + programingLanguage + '\'' +
                ", frameWork='" + frameWork + '\'' +
                ", knowSelenium=" + knowSelenium +
                '}';
    }
}

class Developer extends Employee{
    String Unitetesting;
    String SystemTesting;
    String WritingCode;

    public Developer(String name, String color, int age, double weight, String employeeID, double salary, String title, String department, String unitetesting, String systemTesting, String writingCode) {
        super(name, color, age, weight, employeeID, salary, title, department);
        Unitetesting = unitetesting;
        SystemTesting = systemTesting;
        WritingCode = writingCode;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "Unitetesting='" + Unitetesting + '\'' +
                ", SystemTesting='" + SystemTesting + '\'' +
                ", WritingCode='" + WritingCode + '\'' +
                '}';
    }
}
