package P03_SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P02_SetsOfElements {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String[] size = reader.readLine().split("\\s+");
         int size1 = Integer.parseInt(size[0]);
         int size2 = Integer.parseInt(size[1]);

         Set<Integer> firstLenght = new LinkedHashSet<>();
         Set<Integer> secondLenght = new LinkedHashSet<>();
         List<Integer> output = new ArrayList<>();

        for (int i = 0; i < size1 ; i++) {
            firstLenght.add(Integer.parseInt(reader.readLine()));

        }

        for (int i = 0; i < size2; i++) {
            secondLenght.add(Integer.parseInt(reader.readLine()));
        }

        for (Integer nums : firstLenght) {
            for (Integer num : secondLenght) {
                if (nums == num){
                    output.add(num);
                }
            }
        }
        for (Integer integer : output) {
            System.out.print(integer + " ");
        }
    }
}
