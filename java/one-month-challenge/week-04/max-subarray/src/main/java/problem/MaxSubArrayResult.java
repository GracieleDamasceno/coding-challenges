package problem;

import java.util.List;

public class MaxSubArrayResult {
    /*
     * Complete the 'maxSubarray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> maxSubarray(List<Integer> arr) {
        // Implementation based on solution proposed by paper: https://link.springer.com/article/10.1186/s13173-016-0045-4
        // and https://medium.com/the-research-nest/solving-the-maximum-subarray-sum-a-super-simplified-explanation-34042ffd3fd7

        int currentSubArraySum = arr.get(0), maxSubArraySum = currentSubArraySum;
        int maxSubSequenceSum = arr.get(0), currentSubsequence;
        for (int i = 1; i < arr.size(); i++) {
            //SubArray
            currentSubArraySum = Math.max(arr.get(i), currentSubArraySum + arr.get(i));
            maxSubArraySum = Math.max(maxSubArraySum, currentSubArraySum);
            //SubSequence
            currentSubsequence = Math.max(maxSubSequenceSum, arr.get(i) + maxSubSequenceSum);
            maxSubSequenceSum = Math.max(currentSubsequence, arr.get(i));
        }
        return List.of(maxSubArraySum, maxSubSequenceSum);
    }
}