package problem;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Result {

    /*
     * Complete the 'timeConversion' function below.

     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        return LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa", Locale.US)).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
