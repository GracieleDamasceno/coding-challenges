package problem;

import java.util.List;

public class ChiefHopperResult {
    /*
     * Complete the 'chiefHopper' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int chiefHopper(List<Integer> arr) {
        // Write your code here
        double energyNeeded = 0;

        for (int i = arr.size() - 1; i >=0; i--) {
            energyNeeded = Math.ceil((energyNeeded + arr.get(i)) / 2);
        }
        return (int) energyNeeded;
    }
}
