package P02_LinearDataStructures_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Write a program that reads a matrix from the console.
// Then find the biggest sum of a 2x2 submatrix. Print the submatrix and its sum.

public class P03_MaximumSumOf2x2Submatrix {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] sizeMatrix = reader.readLine().split(", ");
        int rows = Integer.parseInt(sizeMatrix[0]);
        int cols = Integer.parseInt(sizeMatrix[1]);

        int[][] mattrix = new int[rows][cols];
        addElementsInMatrix(mattrix,reader);

        int bestSum = Integer.MIN_VALUE;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        for (int row = 0; row < mattrix.length - 1; row++) {
            for (int col = 0; col < mattrix[0].length - 1; col++) {

                int currentSum = mattrix[row][col] + mattrix[row][col + 1] + mattrix[row + 1][col] +  mattrix[row + 1][col + 1];

                if ( currentSum > bestSum){
                    bestSum = currentSum;
                    num1 = mattrix[row][col];
                    num2 = mattrix[row][col + 1];
                    num3 = mattrix[row + 1][col];
                    num4 = mattrix[row + 1][col + 1];
                }
            }
        }

        System.out.printf("%d %d%n",num1,num2);
        System.out.printf("%d %d%n",num3,num4);
        System.out.println(bestSum);
    }

    private static void addElementsInMatrix(int[][] mattrix, BufferedReader reader) throws IOException {
        for (int i = 0; i < mattrix.length; i++) {
            String[] elements = reader.readLine().split(", ");
            for (int j = 0; j < mattrix[0].length; j++){
                mattrix[i][j] = Integer.parseInt(elements[j]);
            }
        }
    }
}
