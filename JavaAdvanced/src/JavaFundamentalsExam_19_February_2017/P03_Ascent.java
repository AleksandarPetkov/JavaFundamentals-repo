package P00_JavaFundamentalsExam_19_February_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_Ascent {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         Pattern pattern = Pattern.compile("([,|_])(?<lettter>[a-zA-Z]+?)(?<numbers>[\\d])");
         while (true){
             String input = reader.readLine();
             if (input.equals("Ascend")){
                 break;
             }

             Matcher matcher = pattern.matcher(input);

             while (matcher.find()){

                 String oldValue = matcher.group();
                 int number = Integer.parseInt(matcher.group("numbers"));

                 char[] letters = matcher.group("lettter").toCharArray();
                 String manipulation = matcher.group(1);
                 String newValue = "";

                 switch (manipulation){
                     case"_":
                         decryptWith_(oldValue, number, letters , input);
                         newValue = String.copyValueOf(letters);
                         break;
                     case",":
                         decryptWithDot(oldValue, number, letters , input);
                         newValue = String.copyValueOf(letters);
                         break;

                 }
                 input = input.replaceFirst(oldValue, newValue);
                 matcher = pattern.matcher(input);
             }
             System.out.println(input);
         }
    }

    private static void decryptWithDot(String oldValue, int numbers, char[] letters, String input) {

            for (int j = 0; j < letters.length; j++) {
                letters[j] += numbers;
            }

    }

    private static void decryptWith_(String oldValue, int numbers, char[] letters, String input) {

            for (int j = 0; j < letters.length; j++) {
                letters[j] -= numbers;
            }

    }
}
