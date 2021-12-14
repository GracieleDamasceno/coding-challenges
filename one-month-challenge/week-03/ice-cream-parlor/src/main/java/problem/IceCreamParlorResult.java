package problem;

import java.util.ArrayList;
import java.util.List;

public class IceCreamParlorResult {
    /*
     * Complete the 'icecreamParlor' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Write your code here
        List <Integer> flavours = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if(!flavours.isEmpty()){
                break;
            }
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == m){
                    flavours.add(i+1);
                    flavours.add(j+1);
                    break;
                }
            }
        }
        return flavours;
    }
}
