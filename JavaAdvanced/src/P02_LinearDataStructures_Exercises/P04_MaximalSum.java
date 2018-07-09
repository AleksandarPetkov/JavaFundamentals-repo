package P02_LinearDataStructures_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Write a program that reads a rectangular integer matrix of size N x M
//and finds in it the square 3 x 3 that has maximal sum of its elements.
//4 5
//1 5 5 2 4
//2 1 4 14 3
//3 7 11 2 8
//4 8 12 16 4
public class P04_MaximalSum {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String[] size = reader.readLine().split("\\s+");
         int rows = Integer.parseInt(size[0]);
         int cols = Integer.parseInt(size[1]);

         int[][] matrix = new int[rows][cols];
         fillMatrix(matrix,reader);
         int[] firstTargets = new int[3];
         int[] secondTargets = new int[3];
         int[] thirdTargets = new int[3];
         int bestSum = Integer.MIN_VALUE;
         int n1 = 0;
         int n2 = 0;
         int n3 = 0;
         int n4 = 0;
         int n5 = 0;
         int n6 = 0;
         int n7 = 0;
         int n8 = 0;
         int n9 = 0;

        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col <matrix[0].length - 2; col++) {
                int currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
                        matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
                        matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if (currentSum > bestSum){
                    bestSum = currentSum;
                    n1 =  matrix[row][col];
                    n2 = matrix[row][col + 1];
                    n3 =  matrix[row][col + 2];
                    n4 = matrix[row + 1][col];
                    n5 = matrix[row + 1][col + 1];
                    n6 = matrix[row + 1][col + 2];
                    n7 = matrix[row + 2][col];
                    n8 = matrix[row + 2][col + 1];
                    n9 = matrix[row + 2][col + 2];
                }
            }
        }
        System.out.println("Sum = " + bestSum);
        System.out.println(n1+" "+n2+" "+n3);
        System.out.println(n4+" "+n5+" "+n6);
        System.out.println(n7+" "+n8+" "+n9);
    }


    private static void fillMatrix(int[][] matrix, BufferedReader reader) throws IOException {
        for (int i = 0; i < matrix.length; i++) {
            String[] elements = reader.readLine().split("\\s+");
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Integer.parseInt(elements[j]);
            }
        }
    }
}
