package Lecture_Generics_Exercises.p01_GenericBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        Box<String> allBox = new Box<>();
        for (int i = 0; i < n; i++) {
            String value = reader.readLine();
            allBox.add(value);
        }

        System.out.print(allBox.toString());
    }
}
