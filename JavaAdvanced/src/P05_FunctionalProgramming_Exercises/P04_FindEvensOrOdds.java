package P05_FunctionalProgramming_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P04_FindEvensOrOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String command = reader.readLine();

        if (command.equals("odd")){
            for (int i = numbers[0]; i <= numbers[1]; i++) {

                if (i % 2 != 0){
                    System.out.println(i + " ");
                }
            }
            return;
        }else{
            for (int i = numbers[0]; i <= numbers[1]; i++) {

                if (i % 2 == 0){
                    System.out.print(i + " ");
                }
            }
            return;
        }

    }
}
