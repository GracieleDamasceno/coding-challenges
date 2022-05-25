package problem;

public class AppendAndDeleteResult {
    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        int operations = s.length() + t.length();
        if(k > operations){
            return "Yes";
        }
        for (int i = 0, j = Math.min(s.length(), t.length()); i < j; i++, operations -=2) {
            if(s.charAt(i) != t.charAt(i)){
                break;
            }
        }
        if(operations > k || (k - operations) % 2 != 0){
            return "No";
        }
        return "Yes";
    }
}
