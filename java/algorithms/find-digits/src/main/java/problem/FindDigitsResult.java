package problem;

public class FindDigitsResult {
    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) {
        // Write your code here
        String digits = String.valueOf(n);
        int divisors = 0;

        for (int i = 0; i < digits.length(); i++) {
            int currentDigit = Character.getNumericValue(digits.charAt(i));
            if((currentDigit != 0) && (n % currentDigit == 0)){
                divisors++;
            }
        }
        return divisors;
    }
}
