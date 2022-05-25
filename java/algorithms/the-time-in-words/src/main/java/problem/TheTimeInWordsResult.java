package problem;

public class TheTimeInWordsResult {
    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */

    public static String timeInWords(int h, int m) {
        StringBuilder timeInWords = new StringBuilder();
        if(m == 0) {
            timeInWords.append(getNumberInWords(h))
                    .append(" o' clock");
        } else if(m >= 1 && m <= 30) {
            if(m == 1) {
                timeInWords.append(getNumberInWords(m))
                        .append(" minute past ")
                        .append(getNumberInWords(h));
            } else if(m == 15) {
                timeInWords.append("quarter past ")
                        .append(getNumberInWords(h));
            } else if(m == 30) {
                timeInWords.append("half past ")
                        .append(getNumberInWords(h));
            } else {
                timeInWords.append(getNumberInWords(m))
                        .append(" minutes past ")
                        .append(getNumberInWords(h));
            }
        } else {
            if(m == 45) {
                timeInWords.append("quarter to ")
                        .append(getNumberInWords(h + 1));
            } else {
                timeInWords.append(getNumberInWords(60 - m))
                        .append(" minutes to ")
                        .append(getNumberInWords(h + 1));
            }
        }
        return timeInWords.toString();
        // Write your code here
    }
    private static String getNumberInWords(int number) {
        switch (number) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            case 20:
                return "twenty";
            default:
                if(number > 20 && number < 30) {
                    return getNumberInWords(20) + " " + getNumberInWords(number-20);
                } else {
                    return "Unknown number: " + number;
                }
        }
    }
}
