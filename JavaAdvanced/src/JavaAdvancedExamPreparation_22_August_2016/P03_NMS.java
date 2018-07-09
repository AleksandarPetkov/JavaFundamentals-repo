package P00_JavaAdvancedRetakeExam_22_August_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P03_NMS {
    static StringBuilder resultBuilder = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder stringBuilder = new StringBuilder();
        String line;

        while (!(line = buffReader.readLine()).equals("---NMS SEND---")) {
            stringBuilder.append(line);
        }
        process(stringBuilder);

        String delimiter = buffReader.readLine();
        String result = resultBuilder.toString().replaceAll(" ", delimiter);
        System.out.println(result);
    }

    private static void process(StringBuilder stringBuilder) {
        for (int i = 0; i < stringBuilder.length() - 1; i++) {
            char current = Character.toLowerCase(stringBuilder.charAt(i));
            char next = Character.toLowerCase(stringBuilder.charAt(i + 1));
            resultBuilder.append(stringBuilder.charAt(i));
            if (current > next) resultBuilder.append(" ");

        }
        resultBuilder.append(stringBuilder.charAt(stringBuilder.length() - 1));
    }
}
