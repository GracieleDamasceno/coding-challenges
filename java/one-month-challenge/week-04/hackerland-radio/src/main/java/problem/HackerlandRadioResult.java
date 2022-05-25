package problem;

import java.util.Collections;
import java.util.List;

public class HackerlandRadioResult {

    /*
     * Complete the 'hackerlandRadioTransmitters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY x
     *  2. INTEGER k
     */

    public static int hackerlandRadioTransmitters(List<Integer> x, int k) {
        Collections.sort(x);
        int lastHouse = x.get(0), coverage = x.get(0), minNumberTransmitters = 1;

        for (Integer house : x) {
            if((house - lastHouse) > k) {
                coverage = house;
                lastHouse = house;
                minNumberTransmitters++;
            } else if ((house - coverage) <= k){
                lastHouse = house;
            }
        }
        return minNumberTransmitters;
    }
}
