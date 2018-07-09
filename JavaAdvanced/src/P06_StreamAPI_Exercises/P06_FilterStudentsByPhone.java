package P06_StreamAPI_Exercises;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.LinkedHashMap;
        import java.util.Map;

public class P06_FilterStudentsByPhone {
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
                .filter(x -> x.getValue().startsWith("02") || x.getValue().startsWith("+3592"))
                .forEach(x -> System.out.println(x.getKey()));
    }
}
