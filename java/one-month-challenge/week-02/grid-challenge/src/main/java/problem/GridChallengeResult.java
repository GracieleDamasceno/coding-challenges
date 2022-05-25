package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class GridChallengeResult {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */
    public static String gridChallenge(List<String> grid) {
        // Write your code here
        String isAlphabetical = "YES";
        List<String> sortedGrid = new ArrayList<>();

        for (String s : grid) {
            char[] charGrid = s.toCharArray();
            Arrays.sort(charGrid);
            sortedGrid.add(new String(charGrid).trim());
        }

        for (int i = 0; i < sortedGrid.size(); i++) {
            if(i != sortedGrid.size()-1){
                for (int j = 0; j < sortedGrid.get(i).length(); j++) {
                    int asciiColumn = sortedGrid.get(i).charAt(j);
                    int asciiNextColumn = sortedGrid.get(i+1).charAt(j);
                    if(asciiColumn > asciiNextColumn){
                        isAlphabetical = "NO";
                        break;
                    }
                }
            }
        }
        return isAlphabetical;
    }
}

