package problem;

public class RecursiveDigitSumResult {
    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
        // Write your code here
       long sum = 0;
       if(n.length() > 1){
           for (int i = 0; i < n.length(); i++) {
               sum += Integer.parseInt(String.valueOf(n.charAt(i)));
           }
           return superDigit(String.valueOf(sum * k), 1);
       } else {
           return Integer.parseInt(n);
       }
    }
}
