package arraysandstrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneAway {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = bufferedReader.readLine().split(" ");
        System.out.println(oneAway(words[0], words[1]));
    }

    private static boolean oneAway(String word, String word1) {
        if(Math.abs(word.length() - word1.length()) > 1){
            return false;
        }

        int changes = 0, i = 0, j = 0;

        while(i < word.length() && j < word1.length()){
            if(word.charAt(i) != word1.charAt(j)){
                if(changes == 1){
                    return false;
                }
                if(word.length() > word1.length()){
                    i++;
                } else if (word.length() < word1.length()){
                    j++;
                } else{
                    i++; j++;
                }
                changes++;
            } else{
                i++; j++;
            }
        }
        if(i < word.length() || j < word1.length()){
            changes++;
        }

        return changes == 1;
    }
}