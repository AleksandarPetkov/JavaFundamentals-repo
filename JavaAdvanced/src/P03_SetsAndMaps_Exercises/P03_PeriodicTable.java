package P03_SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class P03_PeriodicTable {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(reader.readLine());
         HashSet<String> elements = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");
            for (String el : input) {
                elements.add(el);
            }
        }
        List sortedList = new ArrayList(elements);
        Collections.sort(sortedList);
        for (Object el : sortedList) {
            System.out.print(el + " ");
        }
    }
}
