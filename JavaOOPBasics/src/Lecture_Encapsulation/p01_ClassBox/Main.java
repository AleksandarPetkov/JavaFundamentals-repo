package Lecture_Encapsulation.p01_ClassBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Double[] numbers = new Double[3];
        for (int i = 0; i < 3; i++) {
            double num = Double.parseDouble(reader.readLine());
            numbers[i] = num;
        }

        Box box = new Box(numbers[0], numbers[1], numbers[2]);

        double sArea = box.getSurfaceArea(numbers[0], numbers[1], numbers[2]);
        double lArea = box.getLiteralArea(numbers[0], numbers[1], numbers[2]);
        double volume = box.getVolume(numbers[0], numbers[1], numbers[2]);

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Surface Area - %.2f",sArea))
                .append(System.lineSeparator())
                .append(String.format("Lateral Surface Area - %.2f",lArea))
                .append(System.lineSeparator())
                .append(String.format("Volume - %.2f",volume))
                .append(System.lineSeparator());

        System.out.println(sb.toString());
    }
}
