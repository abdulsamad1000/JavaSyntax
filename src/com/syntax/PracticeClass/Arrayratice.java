package com.syntax.PracticeClass;

import com.syntax.Class20Inheritance.Test;

import java.util.ArrayList;

public class Arrayratice {
    public static void main(String[] args) {
        String name1="Ahmad";
        String name2="Khan";
        String name3="Mike";
        String name4="Jason";
        System.out.println(name1+" "+name2+" "+name3+" "+name4);
        String[]names={"Ahamd","Khan","Mike","Jason"};
        System.out.println(names.length);
        names=new String[4];
        names[0]="Ahmad";
        names[1]="Khan";
        names[2]="Mike";
        names[3]="Jason";
        System.out.println(names.length);
        ArrayList<String> Testers=new ArrayList<>();
        System.out.println(Testers.size());
        Testers.add("Riza");
        Testers.add("Asghar");
        System.out.println(Testers.size());
        Testers.add("Jan");
        Testers.add("Khan");
        System.out.println(Testers.size());
        ArrayList<Integer> Numbers=new ArrayList<>();
        for (int i=1; i<=10; i++){
            if(i% 2!=0) {
                System.out.println(i + " ");
            }
        }

        }

    }

