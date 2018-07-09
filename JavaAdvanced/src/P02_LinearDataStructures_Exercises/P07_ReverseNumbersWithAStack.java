package P02_LinearDataStructures_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class P07_ReverseNumbersWithAStack {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         String[] nums = reader.readLine().split(" ");
         ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (String num : nums) {
            stack.push(Integer.parseInt(num));
        }

        for (int i = 0; i < nums.length ; i++) {
            System.out.print(stack.peek() +" ");
            stack.pop();
        }
    }
}
