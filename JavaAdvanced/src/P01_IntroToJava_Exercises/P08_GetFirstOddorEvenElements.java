package P01_IntroToJava_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class P08_GetFirstOddorEvenElements {
    public static void main(String[] args) throws IOException {

          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> result = new ArrayList<>();
        int[] nums = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[] input = reader.readLine().split("\\s+");

        String command = input[2];
        int target = Integer.parseInt(input[1]);

        int counter = 0;

        if (command.equals("even")){

           for (int i = 0; i < nums.length; i++) {
               if (nums[i] % 2 == 0){
                   result.add(nums[i]);
                   counter++;
               }

               if (counter == target){
                   break;
               }

           }
        }
        else if (command.equals("odd")){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 != 0){
                    result.add(nums[i]);
                    counter++;
                }

                if (counter == target){
                    break;
                }

            }
        }

        for (Integer num : result) {
            System.out.print(num+" ");
        }
    }
}
