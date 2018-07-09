package P02_LinearDataStructures_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Filling a matrix in the regular way (top to bottom and left to right) is boring.
//Write two methods that fill a matrix of size N x N in two different patterns.
//3, B / 3, A
//1 6 7/
//2 5 8/
//3 4 9/
public class P01_FillTheMatrix {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         String[] commands = reader.readLine().split(", ");
         int size = Integer.parseInt(commands[0]);
         int[][] matrix = new int[size][size];

         switch (commands[1]){
             case"A":
                 fillMatrixCaseA(matrix , size);
                 printMatrix(matrix);
                 break;
             case"B":
                 fillMatrixCaseB(matrix);
                 printMatrix(matrix);
                 break;
         }
    }

    private static void fillMatrixCaseB(int[][] matrix) {
        int number = 1;
        for (int row = 0; row < matrix.length; row++) {

            if (row % 2 == 0) {
                for (int col = 0; col < matrix.length; col++) {
                    matrix[col][row] = number;
                    number++;
                }
            } else {
                for (int col = matrix.length - 1; col >= 0; col--) {
                    matrix[col][row] = number;
                    number++;
                }
            }
        }
    }




    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length ; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrixCaseA(int[][] matrix, int size) {
        int number = 1;
        for (int row = 0; row < size ; row++) {
            for (int col = 0; col < size ; col++) {
                matrix[col][row] = number;
                number++;
            }
        }
    }
}
