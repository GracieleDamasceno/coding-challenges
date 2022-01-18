package arraysandstrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCompression {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String word = bufferedReader.readLine().trim();
        System.out.println(stringCompression(word));
    }

    private static String stringCompression(String word) {
        StringBuilder compressed = new StringBuilder();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            count++;
            if (word.length() <= i + 1 || word.charAt(i) != word.charAt(i + 1)){
                compressed.append(word.charAt(i));
                compressed.append(count);
                count = 0;
            }
        }
        return compressed.length() < word.length() ? compressed.toString() : word;
    }
}
