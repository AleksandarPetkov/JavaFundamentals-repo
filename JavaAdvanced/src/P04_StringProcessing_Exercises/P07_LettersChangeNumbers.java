package P04_StringProcessing_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P07_LettersChangeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");

        double totalSum = 0;
        for (String token : input) {

            char firstChar = token.charAt(0);
            char lastChar = token.charAt(token.length() - 1);
            double number = Double.parseDouble(token.substring(1, token.length() - 1));

            int firstPosition = getCharPositionInAlphabets(firstChar);
            int secondPosition = getCharPositionInAlphabets(lastChar);

            double currentSum = getCurrentSum(firstChar,firstPosition,secondPosition,number,lastChar);

            totalSum += currentSum;
        }

        System.out.printf("%.2f",totalSum);
    }

    private static double getCurrentSum(char firstChar, int firstPosition, int secondPosition, double number, char lastChar) {

        if (Character.isLowerCase(firstChar)){
            number *= firstPosition;
        }else {
            number /= firstPosition;
        }

        if (Character.isLowerCase(lastChar)){
            number += secondPosition;
        }else {
            number -= secondPosition;
        }

        return number;
    }

    private static int getCharPositionInAlphabets(char firstChar) {
        int position = 0;

        if (Character.isLowerCase(firstChar)) {

            position = ((int) firstChar - (int) 'a' + 1);
        } else {
            position = ((int) firstChar - (int) 'A' + 1);
        }
        return position;
    }
}
