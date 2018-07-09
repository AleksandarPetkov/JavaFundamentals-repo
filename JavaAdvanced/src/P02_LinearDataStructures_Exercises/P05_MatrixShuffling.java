package P02_LinearDataStructures_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Write a program which reads a string matrix from the console and performs certain operations with its elements.
//User input is provided in a similar way like in the problems above – first you read the dimensions and then the data.
//1 2
//Hello World
//0 0 0 1
//swap 0 0 0 1
//swap 0 1 0 0
//END


public class P05_MatrixShuffling {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String[] size = reader.readLine().split("\\s+");

         int rows = Integer.parseInt(size[0]);
         int cols = Integer.parseInt(size[1]);
         String[][] matrix = new String[rows][cols];
         fillMatrix(matrix,reader);

         while (true){
             String[] commands = reader.readLine().split("\\s+");
             if (commands[0].equals("END")){
                 break;
             }

             if (!commands[0].equals("swap") && commands.length != 0){
                 System.out.println("Invalid input!");
                 continue;

             }
             else{
                 boolean checker = checkForValidParams(matrix, commands);
                 if (checker == true){
                     continue;
                 }

                 changeMatrixPosition(matrix,commands);
                 printCurrentMatrix(matrix);
             }

         }

    }

    private static void printCurrentMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    private static void changeMatrixPosition(String[][] matrix, String[] commands) {
        int cortd1 = Integer.parseInt(commands[1]);
        int cortd2 = Integer.parseInt(commands[2]);
        int cortd3 = Integer.parseInt(commands[3]);
        int cortd4 = Integer.parseInt(commands[4]);

        String remainder = matrix[cortd1][cortd2]; //         0 0
        matrix[cortd1][cortd2] = matrix[cortd3][cortd4]; //   1 1
        matrix[cortd3][cortd4] = remainder;
    }

    private static boolean  checkForValidParams(String[][] matrix, String[] commands) {
        boolean invalidParams = false;
        int num1 = Integer.parseInt(commands[1]);
        int num2 = Integer.parseInt(commands[2]);
        int num3 = Integer.parseInt(commands[3]);
        int num4 = Integer.parseInt(commands[4]);

        if (num1 > matrix.length || num1 < 0){
            System.out.println("Invalid input!");
            return true;
        }
        else if (num2 > matrix[0].length || num2 < 0){
            System.out.println("Invalid input!");
            return true;
        }
        else if (num3 > matrix.length || num3 < 0){
            System.out.println("Invalid input!");
            return true;
        }
        else if (num4 > matrix[0].length || num4 < 0){
            System.out.println("Invalid input!");
            return true;
        }

        return false;
    }

    private static void fillMatrix(String[][] matrix, BufferedReader reader) throws IOException {
        for (int row = 0; row < matrix.length; row++) {
            String[] elements = reader.readLine().split("\\s+");
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = elements[col];
            }
        }
    }
}
