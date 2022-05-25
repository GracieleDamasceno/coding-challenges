package arraysandstrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsUnique {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String word = bufferedReader.readLine().trim();
        System.out.println(isUnique(word));
    }

    private static boolean isUnique (String word){
    /* *
     * Possible answers to this challenge:
     *
     * 1: Using Java's stream to count distinct letters and comparing to the word's size: (Complexity O(n))
     * */
        return word.chars().distinct().count() == word.length();
    /* *
     * 2: One of the answers proposed by the author reads as following: (Also O(n))

         if (str.length() > 128) return false;
         boolean[] char_set = new boolean[128];
         for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
            // Already found this char in string56
                return false;
            }
         char_set[val] = true;
        }
        return true;
    * */
    }
}
