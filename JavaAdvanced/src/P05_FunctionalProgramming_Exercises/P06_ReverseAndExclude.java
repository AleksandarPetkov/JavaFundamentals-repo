package P05_FunctionalProgramming_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class P06_ReverseAndExclude {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays.stream(reader.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int index = Integer.parseInt(reader.readLine());

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % index != 0){
              result.add(numbers.get(i));
            }
        }

        Collections.reverse(result);
        result.forEach(x -> System.out.print(x + " "));
    }
}
