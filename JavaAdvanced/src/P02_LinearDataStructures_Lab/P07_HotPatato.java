package P02_LinearDataStructures_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

//Create a program that simulates the game of Hot Potato.
//Print every kid that is removed from the circle. In the end, print the kid that is left last.

public class P07_HotPatato {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String[] names = reader.readLine().split(" ");
         int n = Integer.parseInt(reader.readLine());

         ArrayDeque<String> queue = new ArrayDeque<>();
         for (String name : names) {
            queue.add(name);
         }

         while (queue.size() > 1){

             for (int i = 1; i < n; i++) {
                 queue.offer(queue.poll());
             }
             System.out.printf("Removed %s%n",queue.poll());
         }
        System.out.printf("Last is %s%n",queue.peek());
    }
}
