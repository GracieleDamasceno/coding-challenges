package arraysandstrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ZeroMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> matrix = new ArrayList<>();
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, n).forEach(i -> {
            try {
                matrix.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        zeroMatrix(matrix);
    }

    private static void zeroMatrix(List<List<Integer>> matrix) {
        boolean[] row = new boolean[matrix.size()];
        boolean[] column = new boolean[matrix.get(0).size()];

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(0).size(); j++) {
                if(matrix.get(i).get(j).equals(0)){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            if (row[i]){
                for (int j = 0; j < matrix.get(0).size(); j++) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        for (int i = 0; i < column.length; i++) {
            if (column[i]){
                for (int j = 0; j < matrix.size(); j++) {
                    matrix.get(j).set(i, 0);
                }
            }
        }

        System.out.println();

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
