package problem;

public class BalancedBracketsResult {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        // Write your code here
        while(true){
            int originalLength = s.length();
            s = s.replaceAll("\\(\\)", "");
            s = s.replaceAll("\\{\\}","");
            s = s.replaceAll("\\[]","");
            s = s.trim();
            if(s.length() == 0 || s.length() == originalLength){
                break;
            }
        }
        if(s.length() == 0){
            return "YES";
        }
        return "NO";
    }
}
