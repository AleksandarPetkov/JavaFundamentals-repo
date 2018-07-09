package P05_FunctionalProgramming_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class P08_FindTheSmallestElement {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int smallestNum = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] <= smallestNum){
                smallestNum = numbers[i];
                index = i;
            }
        }
        System.out.println(index);
    }

}
