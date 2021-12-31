package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class QHeap1Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(bufferedReader.readLine().trim());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            List<Integer> line = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            switch (line.get(0)){
                case 1:
                    minHeap.add(line.get(1));
                    break;
                case 2:
                    minHeap.remove(line.get(1));
                    break;
                case 3:
                    result.add(minHeap.peek());
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + line.get(0));
            }
        }
        result.forEach(System.out::println);
    }
}