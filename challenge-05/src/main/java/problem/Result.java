package problem;

import java.util.Collections;
import java.util.List;

public class Result {
    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
       /*
       //Using XOR operator
       int result = 0;
        for (int i: a) {
            result ^=i;
        }
        return result;*/
        int result = 0;
        a.sort(null);
            while(a.size() > 1) {
                if (a.get(0).equals(a.get(1))) {
                    a.removeAll(Collections.singletonList(a.get(0)));
                } else {
                    result = a.get(0);
                    return result;
                }
            }
        result = a.get(0);
        return result;
    }
}
