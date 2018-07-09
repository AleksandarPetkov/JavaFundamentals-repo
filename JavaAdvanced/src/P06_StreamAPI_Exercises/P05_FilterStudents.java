package P06_StreamAPI_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class P05_FilterStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> students = new LinkedHashMap<>();

        while (true){
            String[] tokens = reader.readLine().split("\\s+");
            if (tokens[0].equals("END")){
                break;
            }
            students.put(tokens[0]+ " "+tokens[1], tokens[2]);
        }

        students.entrySet()
                .stream()
                .filter(x -> x.getValue().endsWith("@gmail.com"))
                .forEach(x -> System.out.println(x.getKey()));
    }
}
