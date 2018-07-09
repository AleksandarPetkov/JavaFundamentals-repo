package P03_SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class P13_DragonArmy {
    private static int DEFAULT_DEMAGE = 45;
    private static int DEFAULT_HEALTH = 250;
    private static int DEFAULT_ARMOR = 10;

    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         LinkedHashMap<String,TreeMap<String , int[]>> dragons = new LinkedHashMap<>();

         int n = Integer.parseInt(reader.readLine());
         for (int i = 0; i < n; i++) {

             String[] line = reader.readLine().split("\\s+");

             String type = line[0];
             String dragonName = line[1];
             int damage = line[2].equals("null")? DEFAULT_DEMAGE :Integer.parseInt(line[2]);
             int health = line[3].equals("null")? DEFAULT_HEALTH :Integer.parseInt(line[3]);
             int armor =line[4].equals("null")? DEFAULT_ARMOR :Integer.parseInt(line[4]);

             if (!dragons.containsKey(type)){
                 dragons.put(type, new TreeMap<String, int[]>());
             }
             dragons.get(type).put(dragonName , new int[]{damage, health, armor});
         }

        for (Map.Entry<String , TreeMap<String , int[]>> dragon: dragons.entrySet()) {
             calculateAndPrintAvarage(dragon.getValue(), dragon.getKey());

            for (Map.Entry<String,int[]> currentDragon : dragon.getValue().entrySet()) {
                System.out.println("-"+ currentDragon.getKey() +" -> damage: "+currentDragon.getValue()[0]+", health: "+currentDragon.getValue()[1]+"," +
                        " armor: "+currentDragon.getValue()[2]+"");
            }
        }
    }

    private static void calculateAndPrintAvarage(TreeMap<String, int[]> value , String colour) {
        double avarageDemage = 0;
        double avaregeHealth = 0;
        double avaregeArmor = 0;

        for (int[] ints: value.values()) {
            avarageDemage += ints[0];
            avaregeHealth += ints[1];
            avaregeArmor += ints[2];
        }

        avarageDemage /= value.size();
        avaregeHealth /= value.size();
        avaregeArmor /= value.size();

        System.out.printf("%s::(%.2f/%.2f/%.2f)%n",colour ,avarageDemage,avaregeHealth,avaregeArmor);
    }

}
