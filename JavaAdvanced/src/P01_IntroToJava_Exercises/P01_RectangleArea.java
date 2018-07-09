package P01_IntroToJava_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P01_RectangleArea {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         double[] nums = Arrays.stream(reader.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
         double sum = nums[0] * nums[1];
         System.out.printf("%.2f",sum);

    }
}
