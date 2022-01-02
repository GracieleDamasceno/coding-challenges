package problem;

import java.util.*;

public class QueriesWithFixedLengthResult {
    /*
     * Complete the 'solve' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER_ARRAY queries
     */

    public static List<Integer> solve(List<Integer> arr, List<Integer> queries) {
        // Write your code here
        List<Integer> result = new ArrayList<>();

        for (Integer query : queries) {
            PriorityQueue<Integer> maximaSubArray = new PriorityQueue<>();
            Deque<Integer> subArrayDeque = new ArrayDeque<>();

            for (int i = 0; i < arr.size(); i++) {
                while (!subArrayDeque.isEmpty() && subArrayDeque.peekFirst() <= i - query){
                    subArrayDeque.pollFirst();
                }
                while (!subArrayDeque.isEmpty() && arr.get(subArrayDeque.peekLast()) < arr.get(i)){
                    subArrayDeque.pollLast();
                }

                subArrayDeque.offerLast(i);

                if(i >= query - 1){
                    maximaSubArray.add(arr.get(subArrayDeque.peekFirst()));
                }
            }
            result.add(maximaSubArray.peek());
        }
        return result;
    }
}
