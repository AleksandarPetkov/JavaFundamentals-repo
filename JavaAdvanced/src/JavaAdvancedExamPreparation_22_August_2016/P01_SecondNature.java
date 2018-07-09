package P00_JavaAdvancedRetakeExam_22_August_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class P01_SecondNature {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstInput = reader.readLine().split("\\s+");
        String[] secondInput = reader.readLine().split("\\s+");

        Queue<Integer> flowers = new ArrayDeque<>();
        ArrayDeque<Integer> waters = new ArrayDeque<>();

        addFlowers(firstInput, flowers);
        addWater(secondInput , waters);

        for (int i = 0; i < flowers.size(); i++) {
            int currentFlower = flowers.peek();
            int currentWater = waters.peek();

            int remainder = currentWater - currentFlower;
        }
    }

    private static void addWater(String[] secondInput, ArrayDeque<Integer> waters) {
        for (String str : secondInput) {
            waters.push(Integer.parseInt(str));
        }
    }

    private static void addFlowers(String[] firstInput, Queue<Integer> flowers) {
        for (String str : firstInput) {
            flowers.offer(Integer.parseInt(str ));
        }
    }
}
