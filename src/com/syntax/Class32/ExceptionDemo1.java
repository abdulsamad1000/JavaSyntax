package com.syntax.Class32;

import com.syntax.Util.Constants;
import com.syntax.Util.ExcelReader;

import java.util.List;
import java.util.Map;

public class ExceptionDemo1 {
    public static void main(String[] args) {

        List<Map<String,String>> excelData= ExcelReader.read(Constants.ExcelFilePath);
        /*Map<String ,String> firstRow=excelData.get(1);
        System.out.println(firstRow.get("LastName"));
        System.out.println(firstRow.get("Age"));*/
        for (Map<String,String> row:excelData
        ) {
            for (Map.Entry<String,String> entry: row.entrySet()
            ) {
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            System.out.println("***************");
        }



        System.out.println("import line of code");
    }
}
