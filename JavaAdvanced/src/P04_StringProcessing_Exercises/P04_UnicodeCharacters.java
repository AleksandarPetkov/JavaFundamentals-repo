package P04_StringProcessing_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P04_UnicodeCharacters {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         char[] input = reader.readLine().toCharArray();

         for (char ch : input) {
           toUnicode(ch);
         }

    }

    private static void toUnicode(char ch) {
        System.out.print(String.format("\\u%04x", (int) ch));
    }


}
