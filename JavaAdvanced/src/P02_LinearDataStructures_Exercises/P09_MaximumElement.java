package P02_LinearDataStructures_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
//You have an empty sequence, and you will be given N commands. Each command is one of the following types:
//        •	"1 X" - Push the element X into the stack.
//        •	"2" - Delete the element present at the top of the stack.
//        •	"3" - Print the maximum element in the stack.

public class P09_MaximumElement {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(reader.readLine());

         ArrayDeque<Integer> stack = new ArrayDeque<>();
         for (int i = 0; i < n; i++) {
             String[] commands = reader.readLine().split("\\s+");

             switch (commands[0]){
                 case "1":
                     stack.push(Integer.parseInt(commands[1]));
                     break;
                 case "2":
                     stack.pop();
                     break;
                 case "3":
                     printMaxElement(stack);
                     break;
             }
         }
    }

    private static void printMaxElement(ArrayDeque<Integer> stack) {
        int maxElement = Integer.MIN_VALUE;
        for (Integer integer : stack) {
            if (integer > maxElement){
                maxElement = integer;
            }
        }
        System.out.println(maxElement);
    }
}
