package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExtraLongFactorialsSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        ExtraLongFactorialsResult.extraLongFactorials(n);

        bufferedReader.close();
    }
}
