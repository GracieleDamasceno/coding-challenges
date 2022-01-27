package problem;

import java.util.List;

public class NonDivisibleSubsetResult {
    /*
     * Complete the 'nonDivisibleSubset' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY s
     */

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        int[] subset = new int[k];
        int value = 0;

        for (Integer integer : s) {
            subset[integer % k]++;
        }
        if (subset[0] != 0){
           value = 1;
        }
        for (int i = 1; i <= k / 2; i++) {
            if(i * 2 == k){
                value++;
            } else {
                value += Math.max(subset[i], subset[k - i]);
            }
        }
        return value;
    }
}
