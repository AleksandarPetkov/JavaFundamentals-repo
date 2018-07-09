package P00_JavaAdvancedRetakeExam_22_August_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P02_NatureProphet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] gardenSize = reader.readLine().split("\\s+");
        int rows = Integer.parseInt(gardenSize[0]);
        int cols = Integer.parseInt(gardenSize[1]);

        int[][] garden = new int[rows][cols];

        while (true){
            String line = reader.readLine();
            if (line.equals("Bloom Bloom Plow")){
                break;
            }

            String[] coordinates = line.split("\\s+");

            fillGarden(garden,coordinates);

        }
        printGarden(garden);


    }
    private static void printGarden(int[][] garden) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < garden.length; row++) {
            for (int col = 0; col < garden.length ; col++) {
               sb.append(garden[row][col]).append(" ");
            }
            sb.append(System.lineSeparator());
        }
        System.out.println(sb.toString());
    }

    private static void fillGarden(int[][] garden, String[] coordinates) {
        int x1 = Integer.parseInt(coordinates[0]);
        int x2 = Integer.parseInt(coordinates[1]);



            for (int j = 0; j < garden.length; j++) {
                garden[x1][j]++;

            }

           for (int i = 0; i < garden.length; i++) {
               garden[i][x2]++;
           }
            garden[x1][x2] -= 1;
    }
}
