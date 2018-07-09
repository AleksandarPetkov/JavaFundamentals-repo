package P06_StreamAPI_Exercises;

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P02_StudentsByFirstAndLastName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Pair<String, String>> students = new ArrayList<>();
        while (true) {
            String line = reader.readLine();
            if (line.equals("END")) {
                break;
            }
            String[] tokens = line.split("\\s+");
            students.add(new Pair<>(tokens[0], tokens[1]));
        }

        students.stream()
                .filter(x -> x.getKey().compareTo(x.getValue()) < 0)
                .map(x -> x.getKey() +" "+ x.getValue())
                .forEach(x -> System.out.println(x));
    }
}
