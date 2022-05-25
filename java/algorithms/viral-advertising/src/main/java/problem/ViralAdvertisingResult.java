package problem;

public class ViralAdvertisingResult {
    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
        // Write your code here
        int numberOfPeople = 5;
        int cumulativeLikes = 0;

        for (int i = 0; i < n; i++) {
            numberOfPeople = numberOfPeople / 2;
            cumulativeLikes += numberOfPeople;
            numberOfPeople *= 3;
        }
        return cumulativeLikes;
    }

}