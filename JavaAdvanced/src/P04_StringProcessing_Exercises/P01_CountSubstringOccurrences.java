package P04_StringProcessing_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01_CountSubstringOccurrences {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine().toLowerCase();
        String token = reader.readLine().toLowerCase();

        int index = text.indexOf(token);
        int counter = 0;
        while (index != -1){
            index = text.indexOf(token,index + 1);
            counter++;
        }
        System.out.println(counter);
    }
}
