package P03_SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class P06_MinerTask {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         LinkedHashMap<String,Integer> mapCollect = new LinkedHashMap<>();

         int round = 0;
         String material = "";
         while (true){
             String input = reader.readLine();

             if (input.equals("stop")){
                 break;
             }

             if (round % 2 == 0){
                 if (!mapCollect.containsKey(input)){

                     mapCollect.put(input, 0);
                 }
                 material = input;
             }
             else {
                 int quantity = Integer.parseInt(input);
                 mapCollect.put(material, mapCollect.get(material) + quantity);
             }
             round++;
         }

        for (String element : mapCollect.keySet()) {
            System.out.println(element + " -> " + mapCollect.get(element));
        }
    }
}
