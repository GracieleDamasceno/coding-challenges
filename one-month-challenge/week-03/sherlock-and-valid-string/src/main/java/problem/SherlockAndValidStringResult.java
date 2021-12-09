package problem;

public class SherlockAndValidStringResult {
    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
        // Write your code here
        char firstChar = s.charAt(0);
        long count = s.chars().filter(value -> value == firstChar).count();
        if(s.chars().distinct().filter(value -> s.chars().filter(value2 -> value == value2).count() != count).count() > 1){
            return "NO";
        }
        return "YES";
        //Credits for the neat solution: alexbaico
    }
}
