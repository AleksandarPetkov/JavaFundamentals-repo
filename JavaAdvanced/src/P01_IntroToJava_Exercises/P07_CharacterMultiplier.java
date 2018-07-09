package P01_IntroToJava_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P07_CharacterMultiplier {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         String[] words = reader.readLine().split("\\s+");

         String firstWord = words[0];
         String secondWord = words[1];

         long sum = 0;
         if (firstWord.length() == secondWord.length()){

             for (int i = 0; i < firstWord.length(); i++) {
                 sum += (long) firstWord.charAt(i) * (long) secondWord.charAt(i);
             }
         }
         else {

             int lenght = Integer.min(firstWord.length(),secondWord.length());

             for (int i = 0; i < lenght; i++) {
                 sum += (long) firstWord.charAt(i) * (long) secondWord.charAt(i);
             }

             if (firstWord.length() > secondWord.length()){

                 for (int i = secondWord.length(); i < firstWord.length(); i++) {
                     sum += (long) firstWord.charAt(i);
                 }
             }
             else{

                 for (int i = firstWord.length()  ; i < secondWord.length(); i++) {

                     sum += (long) secondWord.charAt(i);
                 }
             }
         }
        System.out.println(sum);
    }
}
