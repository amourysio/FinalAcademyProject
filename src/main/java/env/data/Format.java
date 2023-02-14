package env.data;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Scanner;

public class Format extends Connection {
    private final StringBuilder infoString;
    private Scanner scan;
    private final JSONParser parse;

    public StringBuilder getInfoString() {
        return infoString;
    }

    public Scanner getScan() {
        return scan;
    }

    public Format() throws IOException {
        this.infoString = new StringBuilder();
        this.scan = new Scanner(getUrl().openStream());
        this.parse = new JSONParser();
    }
    protected JSONArray parseIntoJsonGetArray() throws ParseException {
        JSONArray dataObject = (JSONArray) parse.parse(String.valueOf(getInfoString()));
        return dataObject;

    }
}
