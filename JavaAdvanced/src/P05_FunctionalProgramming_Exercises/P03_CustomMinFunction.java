package P05_FunctionalProgramming_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P03_CustomMinFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> input = Arrays.stream(reader.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer> , Integer> func = integers -> {
            return Collections.min(integers);
        };

        System.out.println( func.apply(input));
    }
}
