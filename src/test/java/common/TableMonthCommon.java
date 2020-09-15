package common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableMonthCommon {
    public static String getMonth(String monthNr){
        Map<String,String> listOfMnth = new HashMap<String, String>();
        listOfMnth.put("1","January");
        listOfMnth.put("2","February");
        listOfMnth.put("3","March");
        listOfMnth.put("4","April");
        listOfMnth.put("5","May");
        listOfMnth.put("6","June");
        listOfMnth.put("7","July");
        listOfMnth.put("8","August");
        listOfMnth.put("9","September");
        listOfMnth.put("10","October");
        listOfMnth.put("11","November");
        listOfMnth.put("12","December");
        return listOfMnth.get(monthNr);
    }
}