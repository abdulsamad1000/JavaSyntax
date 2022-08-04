package com.syntax.ReviewClass13;

import com.syntax.Util.ConfigReader;

import java.util.Properties;

public class ConfigFiles1 {
    public static void main(String[] args) {

        Properties properties= ConfigReader.read("Files/Config.properties");
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("URL"));


    }
}
