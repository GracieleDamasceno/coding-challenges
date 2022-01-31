package problem;

import java.util.List;

public class StockMaximizeResult {

    /*
     * Complete the 'stockmax' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY prices as parameter.
     */

    public static long stockmax(List<Integer> prices) {
        // Write your code here
        long maximumProfit = 0;
        int currentProfit = 0;

        for (int i = prices.size() - 1; i >= 0 ; i--) {
            if(prices.get(i) >= currentProfit){
                currentProfit = prices.get(i);
            }
            maximumProfit += (currentProfit - prices.get(i));
        }
        return maximumProfit;
    }
}
