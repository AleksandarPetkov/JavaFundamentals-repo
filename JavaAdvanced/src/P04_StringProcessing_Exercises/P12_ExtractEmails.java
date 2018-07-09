package P04_StringProcessing_Exercises;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P12_ExtractEmails {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         Pattern pattern = Pattern.compile("(?<=\\s|^)[a-zA-Z0-9][\\w-.]*?[a-zA-Z0-9]@[a-zA-Z-]+\\.[a-zA-Z-]+(\\.[a-zA-Z-]+)*");


         while (true){
             String text = reader.readLine();
             if (text.equals("end")){
                 break;
             }

             Matcher matcher = pattern.matcher(text);

             while (true){
                 if (matcher.find()){
                     System.out.println(matcher.group());
                 }
                 else{
                     break;
                 }
             }

         }
    }
}
