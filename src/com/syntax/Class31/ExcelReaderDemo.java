package com.syntax.Class31;

import com.syntax.Util.Constants;
import com.syntax.Util.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderDemo {
    public static void main(String[] args) throws IOException {

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

    }
}

