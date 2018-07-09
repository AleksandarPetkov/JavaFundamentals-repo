package P03_SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class P04_CountSymbols {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         char[] text = reader.readLine().toCharArray();

         TreeMap<Character,Integer> mapCountSymbols = new TreeMap<>();

        for (char letter : text) {

            if (!mapCountSymbols.containsKey(letter)){
                mapCountSymbols.put(letter,1);
            }
            else{
                mapCountSymbols.put(letter,mapCountSymbols.get(letter) + 1);
            }
        }

        for (Character character : mapCountSymbols.keySet()) {
            System.out.println(character +": "+mapCountSymbols.get(character) +" time/s");
        }
    }
}
