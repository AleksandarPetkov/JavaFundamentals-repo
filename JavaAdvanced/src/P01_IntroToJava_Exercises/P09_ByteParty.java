package P01_IntroToJava_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P09_ByteParty {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         int n = Integer.parseInt(reader.readLine());
         int[] numbers = new int[n];
         for (int i = 0; i < n ; i++) {
             int num = Integer.parseInt(reader.readLine());
             numbers[i] = num;
         }

         while (true){
             String[] commandArgs = reader.readLine().split("\\s+");
             if (commandArgs[0].equals("party")){
                 break;
             }

             String command = commandArgs[0];
             int index = Integer.parseInt(commandArgs[1]);

             switch (command){
                 case "-1":
                     for (int i = 0; i < numbers.length; i++) {
                         numbers[i] = (numbers[i] ^ (1 << index));
                     }
                     break;
                 case "0":
                     int mask = ~(1 << index);
                     for (int i = 0; i < numbers.length; i++) {
                         numbers[i] = numbers[i] & mask;
                     }
                     break;
                 case "1":
                     int mask1 = 1 << index;
                     for (int i = 0; i < numbers.length; i++) {
                         numbers[i] = numbers[i] | mask1;
                     }
                     break;
             }
         }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
