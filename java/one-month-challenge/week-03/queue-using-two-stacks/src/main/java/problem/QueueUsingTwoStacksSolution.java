package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueUsingTwoStacksSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> operations = new ArrayList<>();
        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < q; i++) {
            operations.add(bufferedReader.readLine());
        }
        operateQueue(operations);
    }

    static void operateQueue(List<String> operations){
        Queue<String> queue = new LinkedList<>();
        for (String operation : operations) {
            if (operation.charAt(0) == '1') {
                queue.add(operation.split(" ")[1]);
            }else if(operation.charAt(0) == '2'){
                queue.poll();
            }else if(operation.charAt(0) == '3'){
                System.out.println(queue.element());
            }
        }
    }
}
