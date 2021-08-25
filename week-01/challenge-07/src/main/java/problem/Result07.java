package problem;

import java.util.List;

public class Result07 {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        final int arrSize = arr.size();

        for (int i = 0; i < arrSize; i++){
            for (int j = 0; j < arrSize; j++){
                if (i == j){
                    primaryDiagonal += arr.get(i).get(j);
                }
                if((i + j) == arrSize - 1){
                    secondaryDiagonal += arr.get(i).get(j);
                }
            }
        }
        return Math.abs(primaryDiagonal-secondaryDiagonal);
    }
}