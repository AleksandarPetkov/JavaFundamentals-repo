package P00_JavaFundamentalsExam_19_February_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01_Shockwave {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] sizeMatrix = reader.readLine().split("\\s+");
        int rows = Integer.parseInt(sizeMatrix[0]);
        int cols = Integer.parseInt(sizeMatrix[1]);

        int[][] matrix = new int[rows][cols];
        while (true) {
            String line = reader.readLine();
            if ("Here We Go".equals(line)) {
                break;
            }

            String[] coordinates = line.split("\\s+");

            fillMatrix(matrix, coordinates);
        }
        getPrintMatrix(matrix);
    }

    private static void getPrintMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(int[][] matrix, String[] coordinates) {
        int x1 = Integer.parseInt(coordinates[0]);
        int y1 = Integer.parseInt(coordinates[1]);
        int x2 = Integer.parseInt(coordinates[2]);
        int y2 = Integer.parseInt(coordinates[3]);

        for (int row = x1; row <= x2; row++) {

            for (int col = y1; col <= y2; col++) {

                matrix[row][col]++;
            }
        }


    }
}
