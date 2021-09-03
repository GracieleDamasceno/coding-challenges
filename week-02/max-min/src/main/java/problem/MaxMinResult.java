package problem;

import java.util.Comparator;
import java.util.List;

class MaxMinResult {

    /*
     * Complete the 'maxMin' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int maxMin(int k, List<Integer> arr) {
        // Write your code here
        arr.sort(Comparator.naturalOrder());
        int minUnfairness = arr.get(arr.size()-1);

        for (int i = 0; i < arr.size(); i++) {
            List<Integer> subGroup = arr.subList(i, Math.min(arr.size(), i + k));
            if(subGroup.size() != k){
                break;
            }
            int unfairness = subGroup.get(subGroup.size()-1) - subGroup.get(0);
            if (unfairness < minUnfairness){
                minUnfairness = unfairness;
            }
        }
        return minUnfairness;
    }
}

