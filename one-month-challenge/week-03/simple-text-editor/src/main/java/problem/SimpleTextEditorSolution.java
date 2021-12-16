package problem;

import java.io.*;
import java.util.*;

public class SimpleTextEditorSolution {
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // First line is a integer Q with the number of operations.
        // Each line after that is an operation to be performed, containing a single integer t (between 1 and 4)
        // corresponding to the type od operation. If the operation requires an argument, t is followed by space-separated arguments.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> operations = new ArrayList<>();
        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < q; i++) {
            operations.add(bufferedReader.readLine());
        }
        codeBuilder(operations);
    }

    static void codeBuilder(List<String> operations){
        String data = "";
        Deque<String> originalCode = new ArrayDeque<>();

        for (String operation : operations) {
            if (operation.charAt(0) == '1') {
                data = data + operation.split(" ")[1];
                originalCode.push(data);
            } else if (operation.charAt(0) == '2') {
                data = data.substring(0, data.length() - Integer.parseInt(operation.split(" ")[1]));
                originalCode.push(data);
            } else if (operation.charAt(0) == '3') {
                System.out.println(data.charAt(Integer.parseInt(operation.split(" ")[1]) - 1));
            } else if (operation.charAt(0) == '4') {
                originalCode.pop();
                if(!originalCode.isEmpty()){
                    data = originalCode.peek();
                }else{
                    data = "";
                }
            }
        }
    }
}
