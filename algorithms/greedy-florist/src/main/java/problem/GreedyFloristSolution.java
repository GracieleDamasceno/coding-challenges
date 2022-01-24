package problem;

import java.util.Collections;
import java.util.List;

public class GreedyFloristSolution {
    public static Integer getMinimunCost(int k, List<Integer> c){
        int flowerCost = 0;
        c.sort(Collections.reverseOrder());
        for (int i = 0; i < c.size(); i++) {
            flowerCost += (i / k + 1) * c.get(i);
        }
        return flowerCost;
    }
}
