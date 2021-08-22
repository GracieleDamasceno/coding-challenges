package problem;

public class Result09 {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here
        String result = "pangram";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        final String sorted = s.replaceAll("\\s", "")
                .toLowerCase()
                .chars()
                .sorted()
                .distinct()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        if(alphabet.length() != sorted.length()|| !alphabet.equals(sorted)){
           return result = "not pangram";
        }

        return result;
    }
}