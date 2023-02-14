package env.main;

import env.data.API;
import env.data.Question;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
//        try{
//        URL url = new URL("https://the-trivia-api.com/api/questions");
//
//        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//        conn.setRequestMethod("GET");
//        conn.connect();
//
//        int response = conn.getResponseCode();
//
//        if(response != 200){
//            throw new RuntimeException("HttpResponseCode: " + response);
//        }else{
//            StringBuilder infoString = new StringBuilder();
//            Scanner scanner = new Scanner(url.openStream());
//
//            while(scanner.hasNext()){
//                infoString.append(scanner.nextLine());
//            }
//
//            scanner.close();
//
//            System.out.println(infoString);
//
//            JSONParser parse = new JSONParser();
//            JSONArray dataObject = (JSONArray) parse.parse(String.valueOf(infoString));
//            System.out.println(dataObject);
//
//            JSONObject categoryData = (JSONObject) dataObject.get(5);
//
//            System.out.println(categoryData);
//        }
//        }catch (Exception e){
//            e.printStackTrace();
//        }

//        String key = "difficult";
//        API api = new API();
//
//        JSONArray ap = api.generateQuestionList();
//
//        System.out.println(ap);
        Question quest = new Question();

        System.out.println(quest.getQuest().get(0));


    }
}