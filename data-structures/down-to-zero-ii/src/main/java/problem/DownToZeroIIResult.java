package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DownToZeroIIResult {
    /*
     * Complete the 'downToZero' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */
    static List<Integer> integerList = new ArrayList<>(Arrays.asList(0, 1, 2, 3));

    public static int downToZero(int n) {
        // Write your code here
        while (n >= integerList.size()) {
            int listSize = integerList.size();
            int sizeSqrt = (int) Math.sqrt(listSize);
            int minimumValue = integerList.get(listSize - 1);
            for(int i = 2; i <= sizeSqrt; i++) {
                if(listSize % i == 0) {
                    minimumValue = Math.min(minimumValue, integerList.get(listSize / i));
                }
            }
            integerList.add(1 + minimumValue);
        }
        return integerList.get(n);
    }
}
