package problem;

import java.util.List;

class SherlockAndArrayResult {
    /*
     * Complete the 'balancedSums' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String balancedSums(List<Integer> arr) {
        // Write your code here
        int sumLeft = 0;
        int arrSum = arr.stream().mapToInt(Integer::intValue).sum();

        for (Integer integer : arr) {
            if (sumLeft == (arrSum - sumLeft - integer)) {
                return "YES";
            }
            sumLeft += integer;
        }
        return "NO";
    }
}

