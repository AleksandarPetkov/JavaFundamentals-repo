package P00_JavaAdvancedRetakeExam_03_Jan_2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P04_TheSwanStation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] firstInput = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] secondInput = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> theNumbers = new ArrayDeque<>();
        Deque<Integer> integers = new ArrayDeque<>();

        for (int i = 0; i < firstInput.length; i++) {
            theNumbers.offer(firstInput[i]);
        }
        for (int i = 0; i < secondInput.length; i++) {
            integers.offer(secondInput[i]);
        }

        List<Integer> result = new ArrayList<>();
        while (result.size() != 6){

            int currentNum = theNumbers.peek();
            int currentInt = integers.peek();

            if (currentInt % currentNum == 0){
                result.add(currentInt);
                theNumbers.poll();
                integers.poll();
            }
            else{
                integers.poll();
                integers.addLast(++currentInt);
            }
        }
        for (int i = 0; i < result.size() - 1; i++) {
            System.out.print(result.get(i) + ", ");
        }
        System.out.print(result.get(result.size() - 1));
    }


}
