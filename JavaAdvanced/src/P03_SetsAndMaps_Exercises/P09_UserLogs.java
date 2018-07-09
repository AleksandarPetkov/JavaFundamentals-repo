package P03_SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class P09_UserLogs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, LinkedHashMap<String, Integer>> users = new TreeMap<>();

        while (true) {
            String[] tokens = reader.readLine().split("\\s+");
            if (tokens[0].equals("end")){
                break;
            }

            String ip = tokens[0].substring(3,tokens[0].length());
            String player = tokens[2].substring(5,tokens[2].length());

            if (!users.containsKey(player)){
                users.put(player , new LinkedHashMap<>());
                users.get(player).put(ip , 1);

            }else{

                if (!users.get(player).containsKey(ip)){
                    users.get(player).put(ip , 1);
                }
                else{
                    users.get(player).put(ip ,users.get(player).get(ip) + 1 );
                }
            }

        }

        for (String user : users.keySet()) {
            System.out.println(user+": ");
            LinkedHashMap<String, Integer> ipAndCount = users.get(user);

            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String,Integer> entry : ipAndCount.entrySet()) {

                sb.append(entry.getKey()+" => "+ entry.getValue()+", ");
            }
            sb = sb.replace(sb.length() - 2 , sb.length() ,".");
            System.out.println(sb.toString());

        }
}   }
