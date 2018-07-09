package P05_FunctionalProgramming_Exercises;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;
        import java.util.List;

public class P09_CustomComparator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        List<Integer> odds = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0){
                even.add(number);
            }
            else{
                odds.add(number);
            }
        }
        Collections.sort(even);
        Collections.sort(odds);

        for (Integer integer : even) {
            System.out.print(integer + " ");
        }

        for (Integer integer : odds) {
            System.out.print(integer + " ");
        }
    }
}
