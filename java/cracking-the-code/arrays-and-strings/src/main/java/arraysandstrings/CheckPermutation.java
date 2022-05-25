package arraysandstrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CheckPermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = bufferedReader.readLine().split(" ");
        System.out.println(checkPermutation(words[0], words[1]));
    }

    private static boolean checkPermutation(String word1, String word2){
        if(word1.length() != word2.length()){
            return false;
        }
        /* *
         * Possible answers to this challenge:
         *
         * 1: Sorting the Strings and comparing them: (Complexity O(n*log(n)))
         * */
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);

        /* *
         * 2: One of the answers proposed by the author reads as following: (Also O(n))

            if (s.lengthO != t.lengthO) return false ;
            int[] letters = new int[128]; II Assumption
            char[] s_array = s.toCharArray();
                for (char c : s_array) {// count number of each char i n s.
                    letters[c]++;
                }
                for (int i = e; i < t.length(); i++) {
                    int c = (int) t . charAt(i)j
                    letters[c] --;
                    if (letters[c] < 0) {
                        return false;
                    }
                }
            return true;
        * */
    }
}
