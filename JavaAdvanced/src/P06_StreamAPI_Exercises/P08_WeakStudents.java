package P06_StreamAPI_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class P08_WeakStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, List<Integer>> students = new LinkedHashMap<>();

        while (true){
            String[] tokens = reader.readLine().split("\\s+");
            if (tokens[0].equals("END")){
                break;
            }
            String name = tokens[0] + " " + tokens[1];
            students.put(name, new ArrayList<>());
            for (int i = 2; i < tokens.length ; i++) {
                students.get(name).add(Integer.parseInt(tokens[i]));
            }
        }

        students.entrySet()
                .stream()
                .filter(x -> x.getValue().stream().filter(y -> y <= 3).count() >= 2)
                .forEach(x -> System.out.println(x.getKey()));
    }
}
