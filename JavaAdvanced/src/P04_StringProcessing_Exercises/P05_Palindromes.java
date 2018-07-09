package P04_StringProcessing_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class P05_Palindromes {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         TreeSet<String> result = new TreeSet<>();
         String[] text = reader.readLine().split("[\\s,.?!]+");

         for (String word : text) {
            if (word.length() == 1){
                result.add(word);
            }
            else{

                char leftSide = ' ';
                char rightSide = ' ';
                int counter = 0;
                boolean isPalindrome = true;

                for (int i = 0; i < word.length() / 2; i++) {
                    leftSide = word.charAt(i);
                    rightSide = word.charAt(word.length() - 1 - counter);
                    counter++;

                    if (leftSide != rightSide){
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome == true){
                    result.add(word);
                }

            }
         }

        System.out.print("[");
        System.out.print(String.join(", ",result));
        System.out.print("]");
        System.out.println();
    }
}
