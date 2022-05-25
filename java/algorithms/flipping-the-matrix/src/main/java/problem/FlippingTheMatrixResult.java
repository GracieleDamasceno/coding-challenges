package problem;

import java.util.List;

public class FlippingTheMatrixResult {
    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int sumMatrix = 0, quadraticMatrixSize = matrix.size() / 2, matrixSize = matrix.size();

        for (int i = 0; i < quadraticMatrixSize; i++) {
            for (int j = 0; j < quadraticMatrixSize; j++) {
                sumMatrix += Math.max(Math.max(matrix.get(i).get(j), matrix.get(i).get(matrixSize - j - 1)),
                        Math.max(matrix.get(matrixSize - i - 1).get(j), matrix.get(matrixSize - i - 1).get(matrixSize - j - 1)));
            }
        }
        return sumMatrix;
    }
}
