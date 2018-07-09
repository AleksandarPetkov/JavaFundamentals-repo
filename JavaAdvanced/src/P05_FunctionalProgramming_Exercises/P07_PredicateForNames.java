package P05_FunctionalProgramming_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P07_PredicateForNames {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         int size = Integer.parseInt(reader.readLine());
         String[] words = reader.readLine().split("\\s+");

        for (String word : words) {
            if (word.length() <= size){
                System.out.println(word);
            }
        }
    }
}
