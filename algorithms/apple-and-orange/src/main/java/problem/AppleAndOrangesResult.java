package problem;

import java.util.List;

public class AppleAndOrangesResult {
    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
//    s: integer, starting point of Sam's house location.
//    t: integer, ending location of Sam's house location.
//    a: integer, location of the Apple tree.
//    b: integer, location of the Orange tree.
//    apples: integer array, distances at which each apple falls from the tree.
//    oranges: integer array, distances at which each orange falls from the tree.
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int countApples = 0;
        int countOranges = 0;

        for (Integer apple : apples) {
            if((apple + a) >=  s && (apple + a) <= t){
                countApples++;
            }
        }
        for (Integer orange : oranges) {
            if((orange + b) >=  s && (orange + b) <= t){
                countOranges++;
            }
        }

        System.out.println(countApples);
        System.out.println(countOranges);
    }
}
