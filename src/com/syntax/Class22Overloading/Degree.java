package com.syntax.Class22Overloading;

public class Degree {

        void getPrerequisite(){
            System.out.println("To get a degree you need a high school diploma");
        }
    }
    class Bachelors extends Degree{
        void getPrerequisite(){
            System.out.println(" to get a bacholoar degree you need a high school diploma");
        }
    }
     class Masters extends Degree {
    @Override
        void getPrerequisite() {

        System.out.println("to get a Master degree you need a bachelors degree");
        }
        public static void main(String[] args) {
            Degree degree=new Degree();
            degree.getPrerequisite();
            Bachelors bachelors=new Bachelors();
            bachelors.getPrerequisite();
            Masters masters=new Masters();
            masters.getPrerequisite();
        }
    }


