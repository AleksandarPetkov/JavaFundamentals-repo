package P02_LinearDataStructures_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Write a program to generate the following matrix of palindromes of 3 letters with r rows and c columns like the one in the examples below.
//aaa aba aca ada aea afa
//bbb bcb bdb beb bfb bgb


public class P02_MatrixOfPalindromes {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String[] size = reader.readLine().split(" ");
         int row = Integer.parseInt(size[0]);
        int col = Integer.parseInt(size[1]);

        int[][] matrix = new int[row][col];


        for ( row = 0; row < matrix.length; row++) {

            int middle = 97 + row;
            int first = 97;
            int last = 97;
            first += row;
            last += row;
            for ( col = 0; col < matrix[0].length; col++) {

                if (col == 0){
                    middle = middle + 0;
                }
                else {
                    middle = middle + 1;
                }


                System.out.print((char)first);
                System.out.print((char)middle);
                System.out.print((char)last + " ");
            }
            System.out.println();

        }
    }
}
