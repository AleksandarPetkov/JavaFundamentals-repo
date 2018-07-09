package P01_IntroToJava_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P05_OddAndEvenPairs {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int[] nums = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

         if (nums.length % 2 == 1){
             System.out.println("invalid length");
             return;
         }

        int index = 0;
        for (int i = 0; i < nums.length / 2; i++) {

             if ((nums[index] % 2 == 0) && (nums[index+1] % 2 == 0)){
                 System.out.printf("%d, %d -> both are even%n",nums[index],nums[index + 1]);
             }
             else if ((nums[index] % 2 == 1) && (nums[index+1] % 2 == 1)){
                 System.out.printf("%d, %d -> both are odd%n",nums[index],nums[index + 1]);
             }
             else{
                 System.out.printf("%d, %d -> different%n",nums[index],nums[index + 1]);
             }

             index += 2;
        }
    }
}
