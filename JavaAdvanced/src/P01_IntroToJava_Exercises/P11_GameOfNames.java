package P01_IntroToJava_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11_GameOfNames {
    public static void main(String[] args) throws IOException {

         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         int n = Integer.parseInt(reader.readLine());

         int bestSum = Integer.MIN_VALUE;
         String bestName = "";

         for (int i = 0; i < n ; i++) {

            char[] name = reader.readLine().toCharArray();
            int firstPoints = Integer.parseInt(reader.readLine());

             int sum = 0;
             sum += firstPoints;
             for (char c : name) {

                 if ((int)c % 2 == 0){

                     sum += (int)c;
                 }
                 else {
                     sum -= (int)c;
                 }

             }
             if (sum > bestSum){
                 bestSum = sum;
                 bestName = String.valueOf(name);
             }

         }
        System.out.printf("The winner is %s - %d points",bestName,bestSum);
    }
}
