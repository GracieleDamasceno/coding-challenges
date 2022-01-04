package problem;

import java.util.Objects;

public class HighestValuePalindromeResult {
    /*
     * Complete the 'highestValuePalindrome' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER n
     *  3. INTEGER k
     */

    public static String highestValuePalindrome(String s, int n, int k) {
        char[] charArray = s.toCharArray();
        int changesCount = 0;

        for (int i = 0, j = n - 1; i < j; i++, j--) {
            if (!Objects.equals(charArray[i], charArray[j])) {
                changesCount++;
            }
        }
        if (changesCount > k) {
            return "-1";
        }

        int allChanges = k - changesCount;
        int i = 0;
        int j = charArray.length - 1;

        for (; i <= j; i++, j--) {
            char maxChar = (char) Math.max(charArray[i], charArray[j]);
            if (charArray[i] != charArray[j]) {
                if (maxChar != '9' && allChanges - 1 >= 0) {
                    charArray[i] = '9';
                    charArray[j] = '9';
                    allChanges--;
                } else {
                    charArray[i] = maxChar;
                    charArray[j] = maxChar;
                    changesCount--;
                }
            } else {
                if (maxChar != '9' && allChanges - 2 >= 0) {
                    charArray[i] = '9';
                    charArray[j] = '9';
                    allChanges -= 2;
                }
            }
        }

        if (allChanges != 0 && i - 1 == j + 1) {
            charArray[i - 1] = '9';
        }
        return new String(charArray);
    }
}
