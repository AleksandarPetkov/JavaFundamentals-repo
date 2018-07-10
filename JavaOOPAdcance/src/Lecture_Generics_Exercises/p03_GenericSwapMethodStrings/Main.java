package Lecture_Generics_Exercises.p03_GenericSwapMethodStrings;

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

        String[] indexes = reader.readLine().split("\\s+");
        int index1 = Integer.parseInt(indexes[0]);
        int index2 = Integer.parseInt(indexes[1]);
        allBox.swap(index1,index2);

        System.out.print(allBox.toString());
    }
}
