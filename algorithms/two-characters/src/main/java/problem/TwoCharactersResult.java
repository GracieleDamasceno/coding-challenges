package problem;

import java.util.List;
import java.util.stream.Collectors;

public class TwoCharactersResult {

    /*
     * Complete the 'alternate' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternate(String s) {
        // Write your code here
        List<Character> characterList = s.chars()
                .mapToObj(c ->(char) c).distinct().collect(Collectors.toList());

        int longestStringLength = 0, k = 0;

        for(int i = 0; i < characterList.size(); i++) {
            for(int j = i + 1; j < characterList.size(); j++) {
                String regexPattern = "[^" + characterList.get(i) + characterList.get(j) + "]";
                String cleanString = s.replaceAll(regexPattern,"");

                for(k = 0; k < cleanString.length()-1; k++) {
                    if(cleanString.charAt(k) == cleanString.charAt(k+1))
                        break;
                }

                if(k == cleanString.length()-1) {
                    longestStringLength = Math.max(cleanString.length(), longestStringLength);
                }
            }
        }
        return longestStringLength;
    }
}
