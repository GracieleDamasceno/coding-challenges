package problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WaiterResult {
    /*
     * Complete the 'waiter' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY number
     *  2. INTEGER q
     */

    public static List<Integer> waiter(List<Integer> number, int q) {
        // Write your code here
        List<Integer> answers = new ArrayList<>();
        List<Integer> primeNumbers = IntStream.rangeClosed(2, 10000).filter(WaiterResult::primeChecker).boxed().collect(Collectors.toList());
        Stack<Integer> A = new Stack<>();
        Stack<Integer> B = new Stack<>();

        for (int i = 0; i < q; i++) {
            for(int j = number.size() - 1; j > -1; j--) {
                if (number.get(j) % primeNumbers.get(i) == 0){
                    B.push(number.get(j));
                }else{
                    A.push(number.get(j));
                }
            }
            number.clear();
            number.addAll(A);
            A.clear();
            while (!B.isEmpty()){
                answers.add(B.pop());
            }
        }

        for (int i = number.size() -1; i >=0; i--) {
            answers.add(number.remove(i));
        }

        return answers;
    }

    private static boolean primeChecker(int number) {
        return IntStream.rangeClosed(2, (int) (Math.sqrt(number)))
                .allMatch(n -> number % n != 0);
    }
}
