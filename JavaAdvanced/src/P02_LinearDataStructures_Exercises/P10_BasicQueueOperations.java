package P02_LinearDataStructures_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
//You will be given an integer N representing the number of elements to push onto the stack, an integer S
//        representing the number of elements to pop from the stack and finally an integer X,
//        an element that you should check whether is present in the stack. If it is, print true on the console.
//        If it’s not, print the smallest element currently present in the stack

public class P10_BasicQueueOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] commands = reader.readLine().split("\\s+");
        String[] elements = reader.readLine().split("\\s+");
        ArrayDeque<Integer> queue = new ArrayDeque<>();


        int lenght = Integer.parseInt(commands[0]);
        int removeEl = Integer.parseInt(commands[1]);
        int checker = Integer.parseInt(commands[2]);

        for (int i = 0; i < lenght; i++) {
            queue.add(Integer.parseInt(elements[i]));
        }

        for (int i = 0; i < removeEl; i++) {
            queue.remove();
        }

        if (queue.contains(checker)) {
            System.out.println("true");
        } else {
            if (queue.isEmpty()) {
                System.out.println("0");
                return;
            }
            int minElement = Integer.MAX_VALUE;
            for (Integer integer : queue) {

                if (integer < minElement) {
                    minElement = integer;
                }
            }
            System.out.println(minElement);
        }
    }
}
