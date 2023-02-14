package env.data;

import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import java.io.IOException;
import java.util.ArrayList;

public class Question extends API {
    private JSONArray quest = new JSONArray();


    public Question() throws IOException, ParseException {
        this.quest = generateQuestionList();
    }
    public ArrayList<JSONArray> getQuest() {
        return quest;
    }
    private void setQuest(ArrayList<JSONArray> quest) throws ParseException {

    }
}
