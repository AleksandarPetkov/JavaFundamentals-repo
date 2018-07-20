package Lecture_EnumerationsAndAnnotations_Exercises.p02_CardRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String read = reader.readLine();
        CardRank[] cardRanks = CardRank.values();
        System.out.println("Card Ranks:");
        for (CardRank cardRank : cardRanks) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank.name());
        }
    }
}
