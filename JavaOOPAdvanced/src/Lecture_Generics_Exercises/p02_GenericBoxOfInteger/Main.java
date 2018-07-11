package Lecture_Generics_Exercises.p02_GenericBoxOfInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        Box<Integer> allBox = new Box<>();
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(reader.readLine());
            allBox.add(value);
        }

        System.out.print(allBox.toString());
    }
}
