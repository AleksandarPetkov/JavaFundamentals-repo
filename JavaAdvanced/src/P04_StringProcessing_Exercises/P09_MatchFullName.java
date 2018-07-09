package P04_StringProcessing_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P09_MatchFullName {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         Pattern pattern = Pattern.compile("^[A-Z][a-z]{1,} [A-Z][a-z]{1,}$");

         while (true){
             String input = reader.readLine();

             if (input.equals("end")){
                 break;
             }

             Matcher matcher = pattern.matcher(input);
             if (matcher.find()){
                 System.out.println(input);
             }
         }
    }
}
