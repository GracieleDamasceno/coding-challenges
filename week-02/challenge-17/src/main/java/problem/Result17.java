package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result17 {
    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        // Write your code here
        Character[] charlower = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        List<Character> alphabetLower = new ArrayList<>(Arrays.asList(charlower));
        List<Character> alphabetRotated = new ArrayList<>();
        List<Integer> positions = new ArrayList<>();
        StringBuilder cipher = new StringBuilder();

        int n = k;

        if(k >= alphabetLower.size()){
            n = k % alphabetLower.size();
        }

        for (int i = 0; i < alphabetLower.size(); i++) {
            alphabetRotated.add(alphabetLower.get(n));
            n++;
            if(n == alphabetLower.size()){
                n = 0;
            }
        }

        for (int j = 0; j < s.length(); j++) {
            if(alphabetLower.contains(Character.toLowerCase(s.charAt(j)))){
                positions.add(alphabetLower.indexOf(Character.toLowerCase(s.charAt(j))));
            }else{
                positions.add(-1);
            }

            if(positions.get(j) != -1){
                if(Character.isUpperCase(s.charAt(j))){
                    cipher.append(Character.toUpperCase(alphabetRotated.get(positions.get(j))));
                }else{
                    cipher.append(alphabetRotated.get(positions.get(j)));
                }
            }else{
                cipher.append(s.charAt(j));
            }
        }

        return cipher.toString();
    }
}

