package problem;

class CounterGameResult {
    /*
     * Complete the 'counterGame' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static String counterGame(long n) {
        // Write your code here
        int turn = 1;
        String winner = "";
        while (n > 1){
            if ((n & (n - 1)) == 0){
                n = n/2;
            }else{
                long previousPower = 1L << ((int) (Math.log(n) / Math.log(2)));
                n = n - previousPower;
            }
            if(n == 1){
                if (turn % 2 == 0){
                    winner = "Richard";
                }else {
                    winner = "Louise";
                }
                break;
            }
            turn++;
        }

        return winner;
    }
}

