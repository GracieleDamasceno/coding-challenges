package problem;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Result13 {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int pairs = 0;
        while(!ar.isEmpty()){
            int value = ar.get(0);
            int frequency = Collections.frequency(ar, value);
            pairs += (frequency / 2);
            ar.removeIf(v -> Objects.equals(v, value));
        }
        return pairs;
    }

}