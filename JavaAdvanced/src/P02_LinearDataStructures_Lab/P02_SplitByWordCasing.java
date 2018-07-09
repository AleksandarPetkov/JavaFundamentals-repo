package P02_LinearDataStructures_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P02_SplitByWordCasing {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         String[] text = reader.readLine().split("[,;:.!() \"'\\\\ /\\[\\]\\s]+");

         List<String> upperCase = new ArrayList<>();
         List<String> lowerCase = new ArrayList<>();
         List<String> mixedCase = new ArrayList<>();
         for (String word : text) {

            char test = word.charAt(0);
            if (Character.isDigit(test)){
                mixedCase.add(Character.toString(test));
                continue;
            }

            if (word.equals(word.toUpperCase())){
                upperCase.add(word);
            }
            else if(word.equals(word.toLowerCase())){
                lowerCase.add(word);
            }else{
                mixedCase.add(word);
            }

         }
         System.out.printf("Lower-case: %s%n",String.join(", ",lowerCase));
         System.out.printf("Mixed-case: %s%n",String.join(", ",mixedCase));
         System.out.printf("Upper-case: %s%n",String.join(", ",upperCase));
    }
}
