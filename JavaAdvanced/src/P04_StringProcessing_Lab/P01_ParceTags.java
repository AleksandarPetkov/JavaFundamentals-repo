package P04_StringProcessing_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_ParceTags {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        Pattern pattern = Pattern.compile("<upcase>(.+?)<\\/upcase>");
        Matcher matcher = pattern.matcher(text);
        String oldValuue = "";
        String newValue = "";
        while (true){

            if (matcher.find()){
                oldValuue = matcher.group();
                newValue = matcher.group(1).toUpperCase();

                text = text.replace(oldValuue, newValue);
            }
            else{
                break;
            }
        }
        System.out.println(text);
    }
}
