package Lecture_Encapsulation.p02_ClassBoxDataValidation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double lenght = Double.parseDouble(reader.readLine());
        double width = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());


        try {
            Boxx boxx = new Boxx(lenght, width, height);

            StringBuilder sb = new StringBuilder();
            sb.append(String.format("Surface Area - %.2f", boxx.getSurfaceArea()))
                    .append(System.lineSeparator())
                    .append(String.format("Lateral Surface Area - %.2f", boxx.getLateralSurfaceArea()))
                    .append(System.lineSeparator())
                    .append(String.format("Volume - %.2f", boxx.getVolume()))
                    .append(System.lineSeparator());

            System.out.println(sb.toString());

        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
