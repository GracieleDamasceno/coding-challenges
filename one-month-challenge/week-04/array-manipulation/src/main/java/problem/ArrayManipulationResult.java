package problem;

import java.util.List;

public class ArrayManipulationResult {

    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        long[] arrayOfZeroes = new long[n+2];
        long largestValue = 0;

        for (List<Integer> query : queries) {
            arrayOfZeroes[query.get(0)] = query.get(2) + arrayOfZeroes[query.get(0)];
            arrayOfZeroes[query.get(1) + 1] = -query.get(2) + arrayOfZeroes[query.get(1) + 1];
        }

        for(int i = 1; i < arrayOfZeroes.length; i++){
            arrayOfZeroes[i] = arrayOfZeroes[i-1] + arrayOfZeroes[i];

            if(largestValue < arrayOfZeroes[i]){
                largestValue = arrayOfZeroes[i];
            }
        }
        return largestValue;
    }

}
