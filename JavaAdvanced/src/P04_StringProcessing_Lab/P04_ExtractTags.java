package P04_StringProcessing_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04_ExtractTags {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         while (true){
             String input = reader.readLine();
             if (input.equals("END")){
                 break;
             }

             Pattern pattern = Pattern.compile("<.*?>");
             Matcher matcher = pattern.matcher(input);

             while (matcher.find()){
                 System.out.println(matcher.group());
             }

         }
    }
}
