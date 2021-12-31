package problem;

import java.util.List;
import java.util.PriorityQueue;

public class JesseAndCookiesResult {

    /*
     * Complete the 'cookies' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY A
     */

    public static int cookies(int k, List<Integer> A) {
        // Write your code here
        int iterations = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(A);

        while (priorityQueue.size() > 1 && priorityQueue.peek() <= k) {
            int leastSweetCookie = priorityQueue.poll();
            int secondLeastSweetCookie = priorityQueue.poll();
            int sweetness = leastSweetCookie + (2 * secondLeastSweetCookie);

            priorityQueue.add(sweetness);
            iterations++;
        }
        if(!priorityQueue.isEmpty() && priorityQueue.peek() < k) return -1;
        return iterations;
    }
}
