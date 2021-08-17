package problem;

import java.util.List;

public class Result {
    /*
     * Complete the 'miniMaxSum' function below.
     * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
     * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
     *
     * Input: [1 2 3 4 5], Output: 10 14
     * 
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long maximum = 0;
        long minimum = 0;
        Integer firstElement = 0;

        arr.sort(null);
        firstElement = arr.get(0);

        arr.set(0, 0);
        maximum = arr.stream().mapToLong(e -> e).sum();

        arr.set(0, firstElement);
        arr.set(arr.size() - 1, 0);
        minimum = arr.stream().mapToLong(e -> e).sum();

        System.out.print(minimum+" "+maximum);
    }
}
