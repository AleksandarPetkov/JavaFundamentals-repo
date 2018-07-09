package P02_LinearDataStructures_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class P05_SimpleCalculator {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         String[] input = reader.readLine().split(" ");
         ArrayDeque<String> sequences = new ArrayDeque<>();

        for (String ch : input) {
            sequences.add(ch);
        }

        int counter = 0;
        char nextSign = ' ';
        int current = 0;
        int sum = 0;
        boolean haveNum = false;
        boolean havaSign = false;


        for (String ch : sequences) {
            if (counter == 0){
                current = Integer.parseInt(ch);
                sum += current;
                counter++;
                continue;
            }

            if (ch.equals("-") || ch.equals("+")){

                if (ch.equals("+")){
                    nextSign = '+';
                }
                else {
                    nextSign = '-';
                }
                havaSign = true;
            }else{
                current = Integer.parseInt(ch);
                haveNum = true;
            }

            if (havaSign == true && haveNum == true){

                if (nextSign == '-'){
                    sum -= current;
                }
                else{
                    sum += current;
                }
                havaSign = false;
                haveNum = false;
            }
        }
        System.out.println(sum);
    }
}
