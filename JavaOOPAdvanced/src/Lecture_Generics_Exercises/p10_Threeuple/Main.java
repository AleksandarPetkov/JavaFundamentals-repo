package Lecture_Generics_Exercises.p10_Threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i <= 3; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            if (i == 1){
                Tuple<String, String, String> tuple = new Tuple<>(tokens[0] + " " + tokens[1], tokens[2], tokens[3]);
                System.out.println(tuple.toString());
            }
            if (i == 2){
                Tuple<String, Integer, String> tuple = new Tuple<>(tokens[0], Integer.valueOf(tokens[1]), tokens[2]);
                System.out.println(tuple.toString());
            }
            if (i == 3){
                Tuple<String, Double, String> tuple = new Tuple<>(tokens[0],Double.valueOf(tokens[1]), tokens[2]);
                System.out.println(tuple.toString());
            }
        }
    }


}
