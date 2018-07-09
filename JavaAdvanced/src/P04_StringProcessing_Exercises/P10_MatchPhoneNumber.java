package P04_StringProcessing_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P10_MatchPhoneNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("^\\+359( |-)[2]\\1[0-9]{3}\\1[0-9]{4}$");

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
