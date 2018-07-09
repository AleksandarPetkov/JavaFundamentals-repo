package P03_SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class P05_Phonebook {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         HashMap<String, String> mapPhonebook = new HashMap<>();

         while (true){
             String[] details = reader.readLine().split("-");
             if (details[0].equals("search")){
                 break;
             }

             String name = details[0];
             String number = details[1];

             mapPhonebook.put(name , number);
         }

        while (true){
            String[] details = reader.readLine().split("-");
            if (details[0].equals("stop")){
                break;
            }

            String searchName = details[0];

            if (mapPhonebook.containsKey(searchName)){
                System.out.println(searchName + " -> " + mapPhonebook.get(searchName));
            }
            else {
                System.out.println("Contact "+ searchName +" does not exist.");
            }
        }
    }
}
