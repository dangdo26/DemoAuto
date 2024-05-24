package dataProvider;

import helpers.ExcellHelper;
import helpers.SystemsHelper;

import java.util.Map;

public class DataLogin {
    String excelFilePath = SystemsHelper.getCurrentDir() + "src/test/resources/dataSet/loginnn.xlsx";
    String sheetName = "loginnn";
    int columnIndex = 0;
    public Map<String, String> columnDataMap = ExcellHelper.readExcelColumnAsMap(excelFilePath, sheetName, columnIndex) ;



    }


