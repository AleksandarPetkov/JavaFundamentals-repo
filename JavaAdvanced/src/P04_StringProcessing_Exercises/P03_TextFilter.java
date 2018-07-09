package P04_StringProcessing_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P03_TextFilter {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         String[] bannedWords = reader.readLine().split(", ");
         String text = reader.readLine();

        for (String word : bannedWords) {
            StringBuilder changeWord = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                changeWord.append("*");
            }

            text = text. replaceAll(word , changeWord.toString());
        }
        System.out.println(text);
    }
}
