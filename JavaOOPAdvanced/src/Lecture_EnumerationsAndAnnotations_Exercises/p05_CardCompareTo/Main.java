package Lecture_EnumerationsAndAnnotations_Exercises.p05_CardCompareTo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        DeckOfCards deckOfCards = new DeckOfCards();
        Card card = null;
        for (int i = 0; i < 2 ; i++) {
            String rank = reader.readLine();
            String suits = reader.readLine();
            card = new Card(rank, suits);
            deckOfCards.getCards().add(card);
        }

        deckOfCards.compare( deckOfCards.getCards().get(0),deckOfCards.getCards().get(1));
        for (Card card1 : deckOfCards.getCards()) {
            System.out.println(deckOfCards.getCards().get(1).toString());
            return;
        }

    }
}
