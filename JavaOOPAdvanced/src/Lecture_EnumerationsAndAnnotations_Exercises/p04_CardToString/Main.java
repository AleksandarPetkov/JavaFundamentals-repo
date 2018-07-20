package Lecture_EnumerationsAndAnnotations_Exercises.p04_CardToString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String rank = reader.readLine();
        String suits = reader.readLine();

        Card card = new Card(rank, suits);
        System.out.println(card.toString());
    }
}
