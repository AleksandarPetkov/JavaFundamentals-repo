package P06_StreamAPI_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class P09_StudentsEnrolled {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, List<String>> students = new LinkedHashMap<>();

        while (true){
            String[] tokens = reader.readLine().split("\\s+");
            if (tokens[0].equals("END")){
                break;
            }
            String name = tokens[0] + " " + tokens[1];
            students.put(name, new ArrayList<>());
            for (int i = 1; i < tokens.length ; i++) {
                students.get(name).add(tokens[i]);
            }
        }

        students.entrySet()
                .stream()
                .filter(x -> x.getKey().endsWith("14") || x.getKey().endsWith("15"))
                .forEach(x -> System.out.print(String.join(" ",x.getValue())));
    }
}
