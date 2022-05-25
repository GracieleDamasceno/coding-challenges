package arraysandstrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URLify {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine().trim();
        System.out.println(urlify(string));
    }

    private static String urlify(String string){
        return string.replace(" ", "%20");
    }
}
