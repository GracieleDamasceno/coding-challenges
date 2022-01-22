package arraysandstrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = bufferedReader.readLine().split(" ");
        System.out.println(isRotation(words[0], words[1]));
    }

    private static boolean isRotation(String word, String word1) {
        if(word.length() == word1.length() && word.length() > 0){
            String wordDuplicated = word + word;
            return isSubstring(wordDuplicated, word1);
        }
        return false;
    }

    private static boolean isSubstring(String word, String word1) {
        return word.contains(word1);
    }

}
