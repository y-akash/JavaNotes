import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedUrlException;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    private static HttpURLConnection connection;

    public static void main(String[] args) {
        
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();

        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/albums");
            connection = (HttpURLConnection) url.openConnection();

            // Request Setup
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();
            // System.out.println(status);

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while((line = reader.readLine()) != null)
                    responseContent.append(line);
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while((line = reader.readLine()) != null)
                    responseContent.append(line);
                reader.close();
            }

        } catch(MalformedUrlException e) {
            e.pintStackTrace();
        } catch(IOException e) {
            e.pintStackTrace();
        } finally {
            connection.disconnect();
        }
    }
}