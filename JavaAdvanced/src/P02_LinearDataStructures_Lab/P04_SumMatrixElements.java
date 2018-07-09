package P02_LinearDataStructures_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Write a program that reads a matrix from the console and prints

public class P04_SumMatrixElements {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         long sum = 0;
         String[] sizeMatrix = reader.readLine().split(", ");
         int rows = Integer.parseInt(sizeMatrix[0]);
         int cols = Integer.parseInt(sizeMatrix[1]);

         int[][] mattrix = new int[rows][cols];
         addElementsInMatrix(mattrix,reader);
         sum = getSumFromMatrix(sum, mattrix);

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }

    private static long getSumFromMatrix(long sum, int[][] mattrix) {
        for (int i = 0; i < mattrix.length; i++) {
            for (int j = 0; j < mattrix[0].length; j++) {
                sum += mattrix[i][j];
            }
        }

        return sum;
    }

    private static void addElementsInMatrix(int[][] mattrix, BufferedReader reader) throws IOException {
        for (int i = 0; i < mattrix.length; i++) {
            String[] elements = reader.readLine().split(", ");
            for (int j = 0; j < mattrix[0].length; j++) {
                mattrix[i][j] = Integer.parseInt(elements[j]);
            }
        }
    }
}
