package env.data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class API extends Format {
    private static final int OK = 200;

    public API() throws IOException {
    }


//    public void checkResponseCode(String key){
//        try{
//            int codeResponse = getResponseCode();
//            if(codeResponse != OK){
//                throw new RuntimeException("HttpResponseCode: " + codeResponse);
//            }else{
//
//                while(getScan().hasNext()){
//                    getInfoString().append(getScan().nextLine());
//                }
//
//                getScan().close();
//                System.out.println(parseIntoJsonGetArray(key));
//            }
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

    public JSONArray generateQuestionList() throws ParseException {
        try{
            int codeResponse = getResponseCode();
            if(codeResponse != OK){
                throw new RuntimeException("HttpResponseCode: " + codeResponse);
            }else{
                while(getScan().hasNext()){
                    getInfoString().append(getScan().nextLine());
                }
                getScan().close();
////              System.out.println(parseIntoJsonGetArray());
//                System.out.println(getInfoString());
//                System.out.println(parseIntoJsonGetArray().get(0));
//                System.out.println(parseIntoJsonGetArray());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return parseIntoJsonGetArray();
    }



}
