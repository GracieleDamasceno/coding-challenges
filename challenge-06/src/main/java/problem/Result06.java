package problem;

public class Result06 {
    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
        // Write your code here
        final String binaryString = Long.toBinaryString(Long.parseUnsignedLong(String.valueOf(n)));
        final String padded = String.format("%32s", binaryString).replace(" ", "0");
        StringBuilder convertedPadded = new StringBuilder(padded);
        for (int i = 0; i < padded.length(); i++){
            if(padded.charAt(i) == '0'){
                convertedPadded.setCharAt(i,'1');
            }
            if(padded.charAt(i) == '1'){
                convertedPadded.setCharAt(i, '0');
            }
        }
        return Long.parseUnsignedLong(convertedPadded.toString(),2);
    }
}