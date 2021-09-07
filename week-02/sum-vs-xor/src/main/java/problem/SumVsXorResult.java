package problem;

public class SumVsXorResult {
    /*
     * Complete the 'sumXor' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long sumXor(long n) {
        long i = 0;
        while(n!=0) {
            if(n%2==0) {
                i++;
            }
            n = n/2;
        }
        return (long) Math.pow(2,i);
    }
}
