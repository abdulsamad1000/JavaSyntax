package com.syntax.Class18;

public class Country {
   private String name;
    private int population;
    private int state;

    Country(String name,int population,int state){
        this.name=name;
        this.population=population;
        this.state=state;
    }
    String getCountryInfo(){

        return "Name "+name+" Population "+population+" State "+state;
    }
}


