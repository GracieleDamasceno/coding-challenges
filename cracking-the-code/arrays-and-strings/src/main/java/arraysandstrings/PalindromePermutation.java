package arraysandstrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class PalindromePermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String word = bufferedReader.readLine().trim();
        System.out.println(palindromePermutation(word));
    }

    private static boolean palindromePermutation(String string){
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == ' '){
                continue;
            }
            if(!characterSet.add(string.charAt(i))){
                characterSet.remove(string.charAt(i));
            }
        }
        return characterSet.size() <= 1;
    }
}
