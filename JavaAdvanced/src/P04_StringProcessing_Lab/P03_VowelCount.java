package P04_StringProcessing_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_VowelCount {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         String text = reader.readLine();

         Pattern pattern = Pattern.compile("[aeiouyAEIOUY]");
         Matcher matcher = pattern.matcher(text);

         int counter = 0;
         while (matcher.find()){
             counter++;
         }
        System.out.println("Vowels: "+counter);
    }

}
