package Lecture_EnumerationsAndAnnotations_Exercises.p01_CardSuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String read = reader.readLine();
        CardSuits[] cardSuits = CardSuits.values();
        System.out.println("Card Suits:");
        for (CardSuits cardSuit : cardSuits) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardSuit.ordinal(), cardSuit.name());
        }
    }
}
