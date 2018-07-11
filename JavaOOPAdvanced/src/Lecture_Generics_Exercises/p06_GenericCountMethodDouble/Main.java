package Lecture_Generics_Exercises.p06_GenericCountMethodDouble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        Box<Double> allBox = new Box<>();
        for (int i = 0; i < n; i++) {
            Double value = Double.parseDouble(reader.readLine());
            allBox.add(value);
        }
        Double checker = Double.parseDouble(reader.readLine());
        System.out.print(allBox.getCount(checker));
    }
}
