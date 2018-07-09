package P05_FunctionalProgramming_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P05_AppliedArithmetics {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        while (true) {
            String command = reader.readLine();
            if (command.equals("end")) {
                break;
            }

            switch (command) {
                case "add":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i]++;
                    }
                    break;
                case "multiply":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] *= 2;
                    }
                    break;
                case "subtract":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i]--;
                    }
                    break;
                case "print":
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.print(numbers[i] + " ");

                    }
                    System.out.println();
                    break;
            }
        }
    }
}
