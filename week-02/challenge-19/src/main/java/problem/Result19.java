package problem;

import java.util.ArrayList;
import java.util.List;

class Result19 {
    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        List<List<Integer>> arr = new ArrayList<>(n);
        Integer lastAnswer = 0;
        List<Integer> answersArray = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        for (List<Integer> query : queries) {
            if (query.get(0).equals(1)) {
                int idx = ((query.get(1) ^ lastAnswer) % n);
                arr.add(new ArrayList<>());
                arr.get(idx).add(query.get(2));
            }
            if (query.get(0).equals(2)) {
                int idx = ((query.get(1) ^ lastAnswer) % n);
                lastAnswer = arr.get(idx).get(query.get(2) % arr.get(idx).size());
                answersArray.add(lastAnswer);
            }
        }
        return answersArray;
    }
}

