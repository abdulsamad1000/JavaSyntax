package com.syntax.Class19;

public class TeacherTester {
    public static void main(String[] args) {
      MathTeacher mathTeacher=new MathTeacher("Asghar","Java Instructor","Morning");
      mathTeacher.printInfo();
      ChemistryTeacher chemistryTeacher=new ChemistryTeacher("Arif","Chemistery Instructro ","Evening");
      chemistryTeacher.printInfo();
      PianoTeacher pianoTeacher=new PianoTeacher("Bilal","Gitar Instructro","Afternoon");
      pianoTeacher.printInfo();
    }
}
