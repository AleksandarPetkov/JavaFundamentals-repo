package P03_SetsAndMaps_Exercises;

import java.util.*;

public class P11_LogsAggregator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        TreeMap<String, HashMap<Integer, TreeSet<String>>>  input= new TreeMap<>();
        for (int i = 0; i < n; i++) {
            ArrayList <String> ips = new ArrayList<>();
            String[] temp = sc.nextLine().split(" ");
            if (!input.containsKey(temp[1])) {
                input.put(temp[1], new HashMap(){{put(Integer.parseInt(temp[2]),new TreeSet<String>() {{
                    add(temp[0]);
                }});}});
            } else if (input.containsKey(temp[1])) {
                int tempminses = 0;
                for (Integer s : input.get(temp[1]).keySet()) {
                    tempminses = s;
                }
                int temp2 = tempminses +Integer.parseInt(temp[2]);
                input.get(temp[1]).put(temp2, input.get(temp[1]).remove(tempminses));
                input.get(temp[1]).get(temp2).add(temp[0]);

            }

        }
        Iterator<String> keySetIterator = input.keySet().iterator();
        while(keySetIterator.hasNext()){
            String key = keySetIterator.next();
            System.out.println(key + ": " + input.get(key).toString().replace("{", "").replace("}", "").replace("=", " "));
        }

    }
}
