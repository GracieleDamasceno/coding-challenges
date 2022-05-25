package problem;

import java.util.List;

class PlusMinusResult {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double numberOfZeroes = 0;
        double numberOfPositives = 0;
        double numberOfNegatives = 0;
        double arraySize = arr.size();

        for (Integer i : arr) {
           if(i == 0){
               numberOfZeroes++;
           } else if(i > 0){
               numberOfPositives++;
           } else {
               numberOfNegatives++;
           }
        }

        double positiveResult = numberOfPositives/arraySize;
        double negativeResult = numberOfNegatives/arraySize;
        double zeroesResult = numberOfZeroes/arraySize;

        System.out.println(String.format("%.6f",positiveResult));
        System.out.println(String.format("%.6f",negativeResult));
        System.out.println(String.format("%.6f",zeroesResult));
    }
}

