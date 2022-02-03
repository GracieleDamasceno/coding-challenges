package problem;

import java.util.List;

public class CoinChangeResult {
    /*
     * Complete the 'getWays' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. LONG_INTEGER_ARRAY c
     */

    public static long getWays(int n, List<Long> c) {
        // Write your code here
        long[] possibleCombinations = new long[n + 1];
        possibleCombinations[0] = 1;

        for (Long coin : c) {
            for (int i = 1; i <= n; i++) {
                if(i >= coin){
                    possibleCombinations[i] += possibleCombinations[i - coin.intValue()];
                }
            }
        }
        return possibleCombinations[n];
    }
}
