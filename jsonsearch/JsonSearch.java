package jsonsearch;

import java.io.FileReader;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonSearch {
    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(System.in);
        String search=sc.next();
        JSONParser parser = new JSONParser();
        JSONArray a = (JSONArray) parser.parse(new FileReader("json.json"));
            for (Object o : a) 
                if(o.toString().contains(search))
                      System.out.println(extractData(o,"id,title,year,content"));
    }
    static String extractData(Object data,String key) {
        String st="[";
        JSONObject mydata = (JSONObject) data;
        for (String col : key.split(","))
            st+= mydata.get(col)+"][";
        return st;
    }
}