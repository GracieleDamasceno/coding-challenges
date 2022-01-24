package problem;

public class EncriptionSolution {
    /*
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String encryption(String s) {
        // Write your code here
        String trimString = s.trim();
        StringBuilder stringBuilder = new StringBuilder();
        int stringLength = trimString.length();
        double sqrtLength = Math.sqrt(stringLength);
        int column = (int) Math.ceil(sqrtLength);

        for (int i = 0; i < column; i++) {
            int count = i;
            while (count < stringLength){
                stringBuilder.append(trimString.charAt(count));
                count += column;
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
