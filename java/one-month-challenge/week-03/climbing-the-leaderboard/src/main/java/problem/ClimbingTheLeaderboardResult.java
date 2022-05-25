package problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ClimbingTheLeaderboardResult {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> positions = new ArrayList<>();
        int index = 0;
        ranked = ranked.stream().distinct().collect(Collectors.toList());
        Collections.reverse(ranked);
        for (Integer integer : player) {
            for (int j = index; j < ranked.size(); j++) {
                if (integer < ranked.get(j)) {
                    positions.add(ranked.size() - j + 1);
                    index = j;
                    break;
                } else if (j == ranked.size() - 1) {
                    positions.add(ranked.size() - j);
                }
            }
        }
        return positions;
    }
}
