package problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Result04 {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        queries.forEach(element -> result.add(Collections.frequency(strings, element)));
        return result;
    }
}
