package com.syntax.ReviewClass13;

import com.syntax.Util.ExcelReader;

import java.util.List;
import java.util.Map;

public class ExcelFileDemo2 {
    public static void main(String[] args) {
        List<Map<String,String>> excelData= ExcelReader.read("Files/SDETBatch13.xlsx");
        System.out.println(excelData);
        System.out.println(excelData.get(0).get("Country"));

    }
}
