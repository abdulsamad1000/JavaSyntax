package com.syntax.ReviewClass10;

public final class FinalDemo {
    final String company;
    FinalDemo(String company){
        this.company=company;
    }
    void changeCompany(){
        //  company="Facebook"; Can't reassign it because it is final
    }
}
