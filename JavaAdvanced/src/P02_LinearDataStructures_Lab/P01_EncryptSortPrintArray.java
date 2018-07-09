package P02_LinearDataStructures_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//Write a program that reads a sequence of strings from the console. Encrypt every string by summing:
//        •	The code of each vowel multiplied by the string length
//        •	The code of each consonant divided by the string length
//        Sort the number sequence alphabetically and print it on the console.

public class P01_EncryptSortPrintArray {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         int n = Integer.parseInt(reader.readLine());
         int[] results = new int[n];
         for (int i = 0; i < n; i++) {
             char[] word = reader.readLine().toCharArray();

             int currentResult = 0;

             for (char ch : word) {

                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
                         || ch == 'I' || ch == 'O' || ch == 'U'){

                     currentResult += (int)ch * word.length;
                 }
                 else {
                     currentResult += (int)ch  / word.length;
                 }
             }
             results[i] = currentResult;
         }
         Arrays.sort(results);
        for (int result : results) {
            System.out.println(result);
        }
    }
}
