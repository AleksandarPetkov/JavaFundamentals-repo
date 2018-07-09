package P03_SetsAndMaps_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class P02_SoftUniParty {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         TreeSet<String> guests = new TreeSet<>();

         while (true){
             String name = reader.readLine();
             if (name.equals("PARTY")){
                 break;
             }
             guests.add(name);
         }

        while (true){
            String checkGuest = reader.readLine();
            if (checkGuest.equals("END")){
                break;
            }
            guests.remove(checkGuest);
        }

        System.out.println(guests.size());
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
