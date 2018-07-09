package P02_LinearDataStructures_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Write a program that finds the difference between the sums of the square matrix diagonals (absolute value).
//3
//11 2 4
//4 5 6
//10 8 -12
public class P03_DiagonalDifference {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int size = Integer.parseInt(reader.readLine());

        int[][] matrix = new int[size][size];
        fillMatrix(matrix,reader);

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        primaryDiagonal = getPrimaryDiagonal(matrix);
        secondaryDiagonal = getSecondaryDiagonal(matrix);
        int result = Math.abs(primaryDiagonal - secondaryDiagonal);
        System.out.println(result);
    }

    private static int getSecondaryDiagonal(int[][] matrix) {
        int diagonal = 0;
        int counter = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            diagonal += matrix[counter][i];
            counter++;
        }

        return diagonal;
    }

    private static int getPrimaryDiagonal(int[][] matrix) {
        int diagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            diagonal += matrix[i][i];
        }

        return diagonal;
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
