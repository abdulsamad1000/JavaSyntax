package com.syntax.Class18;

public class PhoneTester {
    public static void main(String[] args) {
        Phone phone=new Phone("Samsung ","Note13",512,5.8);
        phone.printInfo();
        Phone phone1=new Phone("Apple ","ProMax ",128,5.4);
        phone1.printInfo();
        Phone phone2=new Phone("Pixel ","Pixel12",68,5.8);
        phone2.printInfo();
        Phone phone3=new Phone("googlePhone","Google13",248,5.9);
        phone3.printInfo();
    }
}
