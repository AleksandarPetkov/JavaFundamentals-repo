package P04_StringProcessing_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P02_SumBigNumbers {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         BigInteger firstNum = new BigInteger(reader.readLine());
         BigInteger secondNum = new BigInteger(reader.readLine());

         BigInteger sum = firstNum.add(secondNum);
         System.out.println(sum);
    }
}
