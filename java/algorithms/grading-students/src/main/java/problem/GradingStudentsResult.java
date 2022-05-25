package problem;

import java.util.ArrayList;
import java.util.List;

public class GradingStudentsResult {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> roundedGrades = new ArrayList<>();

        for (Integer grade : grades) {
            int nextMultiple = grade + (5 - grade % 5);
            if (nextMultiple - grade < 3 && grade >= 38) {
                roundedGrades.add(nextMultiple);
            } else {
                roundedGrades.add(grade);
            }
        }
        return roundedGrades;
    }
}
