package problem;

public class CommonChildResult {
    /*
     * Complete the 'commonChild' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static int commonChild(String s1, String s2) {
        // Write your code here
        int [][] matrix = new int[s1.length()+1][s2.length()+1];

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if(s1.charAt(i) == s2.charAt(j)) {
                    matrix[i+1][j+1] = matrix[i][j] + 1;
                } else {
                    matrix[i+1][j+1] = Math.max(matrix[i][j+1], matrix[i+1][j]);
                }
            }
        }
        return matrix[s1.length()][s2.length()];
    }
}
