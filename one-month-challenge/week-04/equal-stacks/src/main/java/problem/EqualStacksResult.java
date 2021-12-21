package problem;

import java.util.List;

public class EqualStacksResult {

    /*
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        if(h1.isEmpty() || h2.isEmpty() || h3.isEmpty()){
            return 0;
        }

        int sumH1 = h1.stream().mapToInt(Integer::intValue).sum();
        int sumH2 = h2.stream().mapToInt(Integer::intValue).sum();
        int sumH3 = h3.stream().mapToInt(Integer::intValue).sum();

        while (sumH1 != sumH2 || sumH1 != sumH3) {
            if (sumH1 >= sumH2 && sumH1 >= sumH3) {
                sumH1 -= h1.remove(0);
            } else if (sumH2 >= sumH1 && sumH2 >= sumH3) {
                sumH2 -= h2.remove(0);
            } else {
                sumH3 -= h3.remove(0);
            }
        }

        return sumH1;
    }
}
