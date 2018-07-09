package P01_IntroToJava_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P04_CalculateExpression {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         double[] nums = Arrays.stream(reader.readLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

         double a = nums[0];
         double b = nums[1];
         double c = nums[2];

        double pow = (a+b+c)/Math.sqrt(c);
        double result1 = Math.pow((a*a + b*b ) / ((a*a)-(b*b)), pow);
        double result2 = Math.pow(((a*a) + (b*b) - (c*c*c)),a-b);
        double diff = Math.abs(((a+b+c)/3) - ((result1+result2) / 2));
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",result1,result2,diff);

    }
}
