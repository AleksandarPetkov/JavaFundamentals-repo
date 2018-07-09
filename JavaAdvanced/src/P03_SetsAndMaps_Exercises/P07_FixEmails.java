package P03_SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class P07_FixEmails {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        Map<String, String> emails = new LinkedHashMap<>();
        while (!name.equals("stop"))
        {
            String email = reader.readLine();
            String ending = email.substring(email.length() - 3).toLowerCase();
            if (!ending.equals(".uk") && !ending.equals(".us") && !ending.equals("com"))
            {
                emails.put(name, email);
            }
            name = reader.readLine();
        }

        for (Map.Entry<String,String> mail : emails.entrySet()) {
            System.out.printf("%s -> %s%n", mail.getKey(), mail.getValue());
        }

    }
}
