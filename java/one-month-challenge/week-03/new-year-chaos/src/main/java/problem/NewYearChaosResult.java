package problem;

import java.util.List;

public class NewYearChaosResult {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        int changes = 0;

        for (int i = q.size() - 1; i >= 0 ; i--) {
            if(q.get(i) - (i + 1) > 2){
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q.get(i) - 2); j < i; j++) {
                if(q.get(i) < q.get(j)){
                    changes++;
                }
            }

        }
        System.out.println(changes);
    }
}
