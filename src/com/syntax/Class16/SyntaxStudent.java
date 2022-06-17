package com.syntax.Class16;

public class SyntaxStudent {
    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students
    String name;
    int ID;
    static int numberofStudents=0;

    public static void main(String[] args) {
        SyntaxStudent SS=new SyntaxStudent();
        SS.name="Bilal Ahmad";
        SS.ID=1;
        numberofStudents=numberofStudents+1;

        SyntaxStudent SS2=new SyntaxStudent();
        SS2.name="Arif";
        SS2.ID=2;
        numberofStudents=numberofStudents+2;

        SyntaxStudent SS3=new SyntaxStudent();
        SS3.name="Aimal";
        SS3.ID=3;
        numberofStudents=numberofStudents+3;
        System.out.println("The student name is "+SS.name+" The student ID is "+SS.ID);
        System.out.println("The student name is "+SS2.name+" The student ID is "+SS2.ID);
        System.out.println("The student name is "+SS3.name+" The student ID is "+SS3.ID);


    }

}
