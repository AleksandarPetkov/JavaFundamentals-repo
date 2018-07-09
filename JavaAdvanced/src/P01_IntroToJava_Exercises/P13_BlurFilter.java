package P01_IntroToJava_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P13_BlurFilter {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         int blurAmount = Integer.parseInt(reader.readLine());
         String[] sizeMatrix = reader.readLine().split("\\s+");
         int rows = Integer.parseInt(sizeMatrix[0]);
         int cols=  Integer.parseInt(sizeMatrix[1]);

         long[][] matrix = new long[rows][cols];
         addElementsInMatrix(reader, matrix);

         String[] coordinates = reader.readLine().split(" ");
         int targetRow = Integer.parseInt(coordinates[0]);
         int targetCol = Integer.parseInt(coordinates[1]);

         int top = Math.max(0,targetRow - 1);
         int botton = Math.min(targetRow + 1, rows);
         int left = Math.max(0 , targetCol - 1);
         int right = Math.min(targetCol + 1 , cols);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length ; col++) {

                if ((left <= col && col <= right) && (top <= row && row <= botton)){
                    System.out.printf("%d ", matrix[row][col] + blurAmount);
                }
                else{
                    System.out.printf("%d ", matrix[row][col]);
                }
            }
            System.out.println();
        }
    }


    private static void addElementsInMatrix(BufferedReader reader, long[][] matrix) throws IOException {

        for (int row = 0; row < matrix.length ; row++) {
            String[] elements = reader.readLine().split("\\s+");

            for (int col = 0; col < matrix[0].length; col++) {
                 matrix[row][col] = Long.parseLong(elements[col]);
            }
        }
    }
}
