package problem;

import java.util.List;

public class ArrayLeftRotationResult {
    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        for (int i = 0; i < d; i++) {
            arr.add(arr.size(), arr.get(0));
            arr.remove(0);
        }
        return arr;
    }

}