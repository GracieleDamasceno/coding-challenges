package problem;

import java.util.List;

public class Result11 {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     *
    82

    2 3 4 4 2 1 2 5 3 4 4 3 4 1 3 5 4 5 3 1 1 5 4 3 5 3 5 3 4 4 2 4 5 2 3 2 5 3 4 2 4 3 3 4 3 5 2 5 1 3 1 4 2 2 4 3 3 3 3 4 1 1 4 3 1 5 2 5 1 3 5 4 3 3 1 5 3 3 3 4 5 2

    26 8
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int possibilities = 0;
        for (int i = 0; i < s.size(); i++) {
            int segment = i+m;
            if(segment > s.size()){
                break;
            }
            final List<Integer> integers = s.subList(i, segment);
            int sum = 0;
            for (Integer integer : integers) {
                sum += integer;
            }
            if (d == sum) {
                possibilities++;
            }
        }
        return possibilities;
    }
}