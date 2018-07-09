package P03_SetsAndMaps_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
//Write a program that counts in a given array of double values the number of occurrences of each value.

public class P03_CountSameValuesInSequances {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         HashMap<String, Integer> map = new HashMap<>();

         String[] numbers = reader.readLine().split("\\s+");

        for (String number : numbers) {
            if (!map.containsKey(number)){
                map.put(number,1);
            }
            else{
                map.put(number,map.get(number) + 1);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + " - "+ map.get(key) + " times");
        }
    }
}
