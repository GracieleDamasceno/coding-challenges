package problem;

import java.util.Collections;
import java.util.List;

public class MarkAndToysResult {
    /*
     * Complete the 'maximumToys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY prices
     *  2. INTEGER k
     */

    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here
        int maximumGifts = 0, totalCost = 0;
        Collections.sort(prices);

        while (totalCost <= k){
            totalCost += prices.remove(0);
            maximumGifts++;
            if(totalCost + prices.get(0) >= k){
                break;
            }
        }
        return maximumGifts;
    }
}
