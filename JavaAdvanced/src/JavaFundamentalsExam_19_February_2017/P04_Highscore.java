package P00_JavaFundamentalsExam_19_February_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class P04_Highscore {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         Map<String, Map<String, Long>> duels = new LinkedHashMap<>();
         while (true){
             String line = reader.readLine();
             if (line.equals("osu!")){
                 break;
             }

             String[] tokens = line.split("[\\s<>-]+");

             String firstPlayerName = tokens[1];
             String secondPlayerName = tokens[2];
             long firstPlayerScore = Long.parseLong(tokens[0]);
             long secondPlayerScore = Long.parseLong(tokens[3]);

             if (!duels.containsKey(firstPlayerName)){
                 duels.put(firstPlayerName, new LinkedHashMap<>());
             }

             if (!duels.get(firstPlayerName).containsKey(secondPlayerName)){
                 duels.get(firstPlayerName).put(secondPlayerName , firstPlayerScore - secondPlayerScore);
             }else {
                 duels.get(firstPlayerName).put(secondPlayerName ,
                         duels.get(firstPlayerName).get(secondPlayerName) + (firstPlayerScore - secondPlayerScore));
             }


             if (!duels.containsKey(secondPlayerName)){
                 duels.put(secondPlayerName, new LinkedHashMap<>());
             }

             if (!duels.get(secondPlayerName).containsKey(firstPlayerName)){
                 duels.get(secondPlayerName).put(firstPlayerName , secondPlayerScore - firstPlayerScore);
             }else {
                 duels.get(secondPlayerName).put(firstPlayerName ,
                         duels.get(secondPlayerName).get(firstPlayerName) + (secondPlayerScore - firstPlayerScore));
             }

         }


    }
}
