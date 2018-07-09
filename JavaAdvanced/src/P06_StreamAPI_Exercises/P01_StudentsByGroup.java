package P06_StreamAPI_Exercises;

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P01_StudentsByGroup {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Pair<String, String>> students = new ArrayList<>();
        while (true) {
            String line = reader.readLine();
            if (line.equals("END")) {
                break;
            }
            String[] tokens = line.split("\\s+");

            if (tokens[2].equals("2")){
                students.add(new Pair<>(tokens[0], tokens[1]));
            students.stream().sorted(Comparator.comparing(x -> x.getKey())).map(x -> x.getKey() + " " + x.getValue())
                    .forEach(x -> System.out.println(x));

        }}
    }
}
