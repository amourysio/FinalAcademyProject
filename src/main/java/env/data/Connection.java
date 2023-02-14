package env.data;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connection {
    private static final String API_URL = "https://the-trivia-api.com/api/questions";
    private HttpURLConnection conn;


    private final URL url;
    public Connection() throws IOException {
        this.url = new URL(API_URL);
        this.conn = (HttpURLConnection) this.url.openConnection();
    }
    public URL getUrl() {
        return url;
    }
    public int getResponseCode() throws IOException {
        conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        return conn.getResponseCode();
    }
}
