package P04_StringProcessing_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P13_SentenceExtractor {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         String serchingWord = reader.readLine();
         serchingWord = " " + serchingWord + " ";
         String text = reader.readLine();

         Pattern pattern = Pattern.compile("(?<=\\s|^).+?[.!?]");
         Matcher matcher = pattern.matcher(text);

         while (true){
             if (matcher.find()){

                 if (matcher.group().contains(serchingWord)){
                     System.out.println(matcher.group());
                 }
             }
             else{
                 break;
             }
         }

    }
}
