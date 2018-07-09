package P05_FunctionalProgramming_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P02_KnightsOfHonor {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Arrays.stream(reader.readLine().split("\\s+")).forEach(x -> System.out.println("Sir " + x));
    }
}
