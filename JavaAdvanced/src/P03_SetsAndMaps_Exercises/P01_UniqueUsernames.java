package P03_SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class P01_UniqueUsernames {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(reader.readLine());
         LinkedHashSet<String> usernames = new LinkedHashSet<>();

         for (int i = 0; i < n; i++) {
             String name = reader.readLine();
             usernames.add(name);
         }

        for (String username : usernames) {
            System.out.println(username);
        }
    }
}
